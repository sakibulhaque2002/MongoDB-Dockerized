package com.example.mongodb.repository;

import com.example.mongodb.model.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<AppUser, String> {
    // you can add custom queries if needed later
}
