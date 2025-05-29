package com.akiskawi.mt.repository;

import com.akiskawi.mt.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {

}