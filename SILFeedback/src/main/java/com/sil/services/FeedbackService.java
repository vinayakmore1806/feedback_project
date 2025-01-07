package com.sil.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sil.DTO.CommentUpdateRequest;
import com.sil.model.CommentUpdate;
import com.sil.model.Feedback;
import com.sil.model.FeedbackSection;
import com.sil.repositories.FeedbackRepository;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return (List<Feedback>) feedbackRepository.findAll();
    }

    public Feedback getFeedbackById(String id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    public void deleteFeedback(String id) {
        feedbackRepository.deleteById(id);
    }
    
    // Read Feedback
    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }
    
    //Update multiple comments for a feedback section
    public Feedback updateMultipleComments(String id, List<CommentUpdateRequest> commentUpdateRequests) {
        Optional<Feedback> feedbackOpt = feedbackRepository.findById(id);

        System.out.println("find result :"+feedbackOpt.get().getBankName());
        if (feedbackOpt.isEmpty()) {
            throw new RuntimeException("Feedback not found with ID: " + id);
        }

        Feedback feedback = feedbackOpt.get();

        // Loop through each update request and update the corresponding section
        for (CommentUpdateRequest request : commentUpdateRequests) {
            FeedbackSection feedbackSection = getFeedbackSectionByName(feedback, request.getFeedbackSection());

            System.out.println("feedback section by name :"+feedbackSection.getFeedback());
            if (feedbackSection == null) {
                throw new RuntimeException("Invalid feedback section: " + request.getFeedbackSection());
            }

            // Create a new CommentUpdate object with the provided details
            CommentUpdate commentUpdate = new CommentUpdate(
                request.getComment(),
                request.getUpdateTime(),
                request.getUserId()
            );

            System.out.println("feedback section by name again :"+commentUpdate.getComment());
            
            // Add the comment update to the section's list of updates
            System.out.println("feedback section by name comment :"+feedbackSection.getCommentUpdates());
            feedbackSection.getCommentUpdates().add(commentUpdate);
        }

        // Save and return the updated feedback record
        return feedbackRepository.save(feedback);
    }

    // Helper method to get the corresponding feedback section
    private FeedbackSection getFeedbackSectionByName(Feedback feedback, String sectionName) {
        switch (sectionName.toLowerCase()) {
            case "corebanking":
                return feedback.getCoreBanking();
            case "atm":
                return feedback.getAtm();
            case "mobilebanking":
                return feedback.getMobileBanking();
            case "internetbanking":
                return feedback.getInternetBanking();
            case "corporateinternetbanking":
                return feedback.getCorporateInternetBanking();
            case "agencybanking":
                return feedback.getAgencyBanking();
            case "upi":
                return feedback.getUpi();
            case "dem":
                return feedback.getDem();
            case "nach":
                return feedback.getNach();
            case "otherproducts":
                return feedback.getOtherProducts();
            default:
                return null;
        }
    }    
}
