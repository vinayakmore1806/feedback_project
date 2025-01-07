package com.sil.DTO;

public class CommentUpdateRequest {
    private String feedbackSection;  // Core Banking, ATM, etc.
    private String comment;          // New comment
    private String updateTime;       // Date and time of the update
    private String userId;           // User ID who updated the comment

    // Getters and Setters

    public String getFeedbackSection() {
        return feedbackSection;
    }

    public void setFeedbackSection(String feedbackSection) {
        this.feedbackSection = feedbackSection;
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
