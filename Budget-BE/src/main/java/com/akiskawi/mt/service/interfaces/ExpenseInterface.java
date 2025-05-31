package com.akiskawi.mt.service.interfaces;

import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.entities.ExpenseEntity;

public interface ExpenseInterface {
    ExpenseEntity addExpense(ExpenseDTO expenseDTO) throws Exception;
}
