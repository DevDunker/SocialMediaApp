package com.example.socialmediaapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmediaapp.Models.PostItem;
import com.example.socialmediaapp.Models.StoryItem;
import com.example.socialmediaapp.R;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>  {



    private List<PostItem> postItems;
    private Context context;

    public PostAdapter(List<PostItem> postItems, Context context) {
        this.postItems = postItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.home_post_layout, parent, false);

        return  new PostAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final PostItem postItem = postItems.get(position);


    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_post;
        CircleImageView iv_profile;
        TextView tv_uname;
        TextView tv_time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_post = (ImageView) itemView.findViewById(R.id.iv_card_post);
            iv_profile= (CircleImageView) itemView.findViewById(R.id.iv_card_profile);
            tv_uname = (TextView) itemView.findViewById(R.id.textView_card_username);
            tv_time = (TextView) itemView.findViewById(R.id.textView_card_time);

        }
    }









}
