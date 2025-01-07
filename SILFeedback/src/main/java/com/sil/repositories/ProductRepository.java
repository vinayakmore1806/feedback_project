package com.sil.repositories;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.sil.model.Product;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {
}
