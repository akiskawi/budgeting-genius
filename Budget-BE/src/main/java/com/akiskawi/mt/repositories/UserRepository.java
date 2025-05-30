package com.akiskawi.mt.repositories;

import com.akiskawi.mt.model.entities.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity,String> {
}
