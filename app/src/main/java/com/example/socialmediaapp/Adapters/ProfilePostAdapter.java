package com.example.socialmediaapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Models.ProfilePostItem;
import com.example.socialmediaapp.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class ProfilePostAdapter extends RecyclerView.Adapter<ProfilePostAdapter.ViewHolder> {

    private List<ProfilePostItem> profilepostItems;
    private Context context;

    public ProfilePostAdapter(List<ProfilePostItem> profilepostItems, Context context) {
        this.profilepostItems = profilepostItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.profile_post_layout,parent,false);

        return new ProfilePostAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int profilePostImage = profilepostItems.get(position).getProfile_postImage();
        holder.iv_profilePost.setImageResource(profilePostImage);

    }

    @Override
    public int getItemCount() {
        return profilepostItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        RoundedImageView iv_profilePost;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_profilePost = (RoundedImageView) itemView.findViewById(R.id.riv_profile_PostPic);
        }
    }



}
