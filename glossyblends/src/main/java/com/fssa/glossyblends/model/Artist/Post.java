package com.fssa.glossyblends.model.Artist;

public class Post {
    private String postId;
    private String title;
    private String description;
    private  String postUrl;

    
    public Post(String postId, String title, String description, String postUrl) {
        this.postId = postId;
        this.title = title;
        this.description = description;
        this.postUrl = postUrl;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }



	
}
