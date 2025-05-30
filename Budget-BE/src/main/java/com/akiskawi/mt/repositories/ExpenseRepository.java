package com.akiskawi.mt.repositories;

import com.akiskawi.mt.model.entities.ExpenseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<ExpenseEntity,String> {
}
