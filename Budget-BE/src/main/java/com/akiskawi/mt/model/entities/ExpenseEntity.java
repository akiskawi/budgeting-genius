package com.akiskawi.mt.model.entities;

import com.akiskawi.mt.model.Money;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection  = ExpenseEntity.expensesCollection)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpenseEntity {

    public static final String expensesCollection = "expenses";

    @Id
    private String id;

    private String typeOfExpense;
    private Money money;
    private LocalDateTime timeOfExpense;
    private String userId;
}
