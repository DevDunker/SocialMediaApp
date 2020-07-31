package com.example.socialmediaapp.Models;

public class StoryItem {

    int img_story;
    boolean isStory;

    public StoryItem(int img_story, boolean isStory) {
        this.img_story = img_story;
        this.isStory = isStory;
    }

    public int getImg_story() {
        return img_story;
    }

    public void setImg_story(int img_story) {
        this.img_story = img_story;
    }

    public boolean isStory() {
        return isStory;
    }

    public void setStory(boolean story) {
        isStory = story;
    }
}
