package com.akiskawi.mt.service.interfaces;

import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.entities.ExpenseEntity;

import java.util.List;

public interface ExpenseServiceInterface {

    ExpenseEntity createOneExpense(ExpenseDTO dto);

    List<ExpenseEntity> getAllOfLoggedInUser(String userId);

    List<ExpenseEntity> getExpensesForMonth(String userId, int year, int month);
}
