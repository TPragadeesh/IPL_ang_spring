package com.example.cricket.repo;

import com.example.cricket.entity.Manager;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


public interface ManagerRepo extends ElasticsearchRepository<Manager, String> {
}
