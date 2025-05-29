package com.akiskawi.mt.repository;

import com.akiskawi.mt.model.entities.ExpenseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ExpenseRepository extends MongoRepository<ExpenseEntity,String> {
List<ExpenseEntity> findByUserId(String userId);
    List<ExpenseEntity> findByUserIdAndTimeOfExpenseBetween(String userId, LocalDateTime start, LocalDateTime end);
}
