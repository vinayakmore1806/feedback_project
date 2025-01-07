package com.sil.repositories;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.sil.model.Feedback;

public interface FeedbackRepository extends ElasticsearchRepository<Feedback, String> {
	List<Feedback> findAll();
}
