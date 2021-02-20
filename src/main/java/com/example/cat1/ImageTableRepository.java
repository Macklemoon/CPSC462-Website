package com.example.cat1;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ImageTableRepository extends MongoRepository<ImageTable, String> {
    List<ImageTable> findByDescription(String description);
    List<ImageTable> findByFileName(String filename);
    Optional<ImageTable> findById(String Id);
    @Override
    List<ImageTable> findAll();
}
