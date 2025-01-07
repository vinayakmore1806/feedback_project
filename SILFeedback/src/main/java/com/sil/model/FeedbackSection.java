package com.sil.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class FeedbackSection {
    private String feedback;
    @Min(1)
    @Max(10)
    private int rating;
    private String satisfactionLevel;
    private List<CommentUpdate> commentUpdates;
    
    // Constructor to initialize the commentUpdates list
    public FeedbackSection() {
        this.commentUpdates = new ArrayList<>();  // Initialize the list
    }
    
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getSatisfactionLevel() {
		return satisfactionLevel;
	}
	public void setSatisfactionLevel(String satisfactionLevel) {
		this.satisfactionLevel = satisfactionLevel;
	}
	public List<CommentUpdate> getCommentUpdates() {
		return commentUpdates;
	}
	public void setCommentUpdates(List<CommentUpdate> commentUpdates) {
		this.commentUpdates = commentUpdates;
	}
	
    // Getters and Setters
    
    
}
