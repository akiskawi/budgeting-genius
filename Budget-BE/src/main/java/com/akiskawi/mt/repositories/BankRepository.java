package com.akiskawi.mt.repositories;

import com.akiskawi.mt.model.entities.BankEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepository extends MongoRepository<BankEntity, String> {

//    Optional<BankEntity> findByUserId(String userId);
}
