package com.akiskawi.mt.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExpenseDTO {

    private String typeOfExpense;
    private Double money;
    private LocalDateTime timeOfExpense;
    private String userId;
    private String bankId;

}
