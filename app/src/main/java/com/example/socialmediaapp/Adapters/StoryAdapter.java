package com.example.socialmediaapp.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Models.StoryItem;
import com.example.socialmediaapp.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {


    private List<StoryItem> storyItems;
    private Context context;


    public StoryAdapter(List<StoryItem> storyItems, Context context) {
        this.storyItems = storyItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.home_story_layout, parent, false);

        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final int color = Color.parseColor("#F076B1");

        final StoryItem storyItem = storyItems.get(position);

        int img_story = storyItem.getImg_story();
        holder.iv_story.setImageResource(img_story);

        boolean isStory = storyItem.isStory();

        if(isStory== true){
            holder.iv_story.setBorderColor(color);
            holder.iv_story.setBorderWidth(6);
        }
    }

    @Override
    public int getItemCount() {
        return storyItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView iv_story;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            iv_story = (CircleImageView) itemView.findViewById(R.id.iv_card_profile);

        }
    }




}



