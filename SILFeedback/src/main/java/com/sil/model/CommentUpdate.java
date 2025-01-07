package com.sil.model;

public class CommentUpdate {
    private String comment;
    private String updateTime;
    private String userId;

    // Constructor, Getters, and Setters

    public CommentUpdate(String comment, String updateTime, String userId) {
        this.comment = comment;
        this.updateTime = updateTime;
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}