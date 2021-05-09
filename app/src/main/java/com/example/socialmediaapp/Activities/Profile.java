package com.example.socialmediaapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.socialmediaapp.Adapters.ProfilePostAdapter;
import com.example.socialmediaapp.Models.ProfilePostItem;
import com.example.socialmediaapp.R;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {

    RecyclerView profilerecyclerView;
    TextView tv_profileHeading, tv_profileUname, tv_profileBio, tv_profilePhotoHeading, tv_profilePhotoCount, tv_profileFollowersHeading, tv_profileFollowersCount, tv_profileFollowsHeading, tv_profileFollowsCount;
    ImageView iv_profileBack;
    private List<ProfilePostItem> profilePostItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv_profileHeading = (TextView) findViewById(R.id.tv_profileHeading);
        tv_profileUname = (TextView) findViewById(R.id.tv_userName);
        tv_profileBio = (TextView) findViewById(R.id.tv_userBio);
        tv_profilePhotoHeading = (TextView) findViewById(R.id.tv_photosHead);
        tv_profilePhotoCount = (TextView) findViewById(R.id.tv_photosCount);
        tv_profileFollowersHeading = (TextView) findViewById(R.id.tv_followersHead);
        tv_profileFollowersCount = (TextView) findViewById(R.id.tv_followersCount);
        tv_profileFollowsHeading = (TextView) findViewById(R.id.tv_followsHead);
        tv_profileFollowsCount = (TextView) findViewById(R.id.tv_followsCount);
        iv_profileBack = (ImageView) findViewById(R.id.iv_back);

        Typeface myFont = Typeface.createFromAsset(getAssets(),"font/Roboto-Bold.ttf");

        tv_profileHeading.setTypeface(myFont);
        tv_profileUname.setTypeface(myFont);
        tv_profileBio.setTypeface(myFont);
        tv_profilePhotoHeading.setTypeface(myFont);
        tv_profilePhotoCount.setTypeface(myFont);
        tv_profileFollowersHeading.setTypeface(myFont);
        tv_profileFollowersCount.setTypeface(myFont);
        tv_profileFollowsHeading.setTypeface(myFont);
        tv_profileFollowsCount.setTypeface(myFont);


        iv_profileBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(Profile.this, MainActivity.class);
                startActivity(HomeIntent);
            }
        });


        initializeProfilePosts();
        getProfilePosts();

    }

    private void initializeProfilePosts(){
        profilerecyclerView = (RecyclerView) findViewById(R.id.rv_profilePost);
        profilerecyclerView.setHasFixedSize(true);
        profilerecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
    }

    private void getProfilePosts(){

        profilePostItems.add(new ProfilePostItem(R.drawable.em_1));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_2));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_3));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_4));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_5));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_6));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_7));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_8));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_9));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_10));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_11));
        profilePostItems.add(new ProfilePostItem(R.drawable.em_12));

        profilerecyclerView.setAdapter(new ProfilePostAdapter(profilePostItems,this));

    }

}