package com.example.socialmediaapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.socialmediaapp.Adapters.StoryAdapter;
import com.example.socialmediaapp.Models.StoryItem;
import com.example.socialmediaapp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv_uname, tv_greeting;
    EditText et_searchBar;

    RecyclerView storyRecyclerView;
    StoryAdapter storyAdapter;

    int[] img_story;
    boolean[] isStory;

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


        intializaStory();
        getStory();

    }


    private void intializaStory(){
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

}
