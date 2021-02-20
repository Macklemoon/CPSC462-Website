package com.example.cat1;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface favoriteRepository extends MongoRepository <favorite,String>{
    List<favorite> findByDescription(String description);
    List<favorite> findByFileName(String filename);
    List<favorite> findAll();


}
