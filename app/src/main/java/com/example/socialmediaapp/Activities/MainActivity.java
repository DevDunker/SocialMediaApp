package com.example.socialmediaapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.socialmediaapp.Adapters.PostAdapter;
import com.example.socialmediaapp.Adapters.StoryAdapter;
import com.example.socialmediaapp.Models.PostItem;
import com.example.socialmediaapp.Models.StoryItem;
import com.example.socialmediaapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv_uname, tv_greeting;
    EditText et_searchBar;

    RecyclerView storyRecyclerView;
    RecyclerView postRecyclerView;

    StoryAdapter storyAdapter;
    PostAdapter postAdapter;

    // story recycler view
    int[] img_story;
    boolean[] isStory;

    // post recycler view
    int[] img_post;
    int[] img_display;
    String[] txt_name;
    String[] txt_time;

    private List<PostItem> postListItems = new ArrayList<>();
    private List<StoryItem> storyListItems = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_uname = (TextView) findViewById(R.id.textView_username);
        tv_greeting = (TextView) findViewById(R.id.textView_greeting);
        et_searchBar = (EditText) findViewById(R.id.editText_searchBar);

        Typeface myFont = Typeface.createFromAsset(getAssets(),"font/as_bold.ttf");
        Typeface myFont1 = Typeface.createFromAsset(getAssets(),"font/Roboto-Bold.ttf");

        et_searchBar.setTypeface(myFont);
        tv_uname.setTypeface(myFont);
        tv_greeting.setTypeface(myFont1);


        intializeStory();
        initializePosts();

        getStory();
        getPosts();

    }


    private void initializePosts(){

        postRecyclerView = findViewById(R.id.rv_post);
        postRecyclerView.setHasFixedSize(true);
        postRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void intializeStory(){
        storyRecyclerView = findViewById(R.id.rv_story);
        storyRecyclerView.setHasFixedSize(true);
        storyRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

    }


    private void getStory(){


        img_story =  new int[] {R.drawable.ic_plus, R.drawable.matt, R.drawable.mathew, R.drawable.jennifer, R.drawable.harry, R.drawable.taylor, R.drawable.matt, R.drawable.mathew};
        isStory = new boolean[]{false,true,false,true,false,true,false,true};

        for(int i=0;i<img_story.length;i++){
            StoryItem storyItem = new StoryItem(img_story[i],
                    isStory[i]);

            storyListItems.add(storyItem);
        }

        storyAdapter = new StoryAdapter(storyListItems,this);
        storyRecyclerView.setAdapter(storyAdapter);

    }

    private void getPosts(){

        img_post = new int[]{R.drawable.post_matt,R.drawable.post_mathew,R.drawable.post_jennifer,R.drawable.post_harry,R.drawable.post_taylor,R.drawable.post_matt};
        img_display = new int[]{R.drawable.matt,R.drawable.mathew,R.drawable.jennifer,R.drawable.harry,R.drawable.taylor,R.drawable.matt};
        txt_name = new String[]{"Matt LeBlanc","Mathew Perry", "Jennifer Aniston","Harry Styles","Taylor Swift","Matt LeBlanc"};
        txt_time= new String[]{"13m ago", "20m ago", "45m ago",  "1h ago", "2h ago", "2h ago"};

        for(int i=0;i<img_post.length;i++){
            PostItem postItem= new PostItem(img_post[i],
                    img_display[i],
                    txt_name[i],
                    txt_time[i]);

            postListItems.add(postItem);
        }

        postAdapter = new PostAdapter(postListItems,this);
        postRecyclerView.setAdapter(postAdapter);




    }




}
