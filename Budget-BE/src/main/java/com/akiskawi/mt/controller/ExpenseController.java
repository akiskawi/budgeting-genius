package com.akiskawi.mt.controller;

import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.entities.ExpenseEntity;
import com.akiskawi.mt.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expense/")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService service;

    @PostMapping("add")
    public String addExpense(@RequestBody ExpenseDTO expenseDTO) throws Exception {
        ExpenseEntity expense = service.addExpense(expenseDTO);
        return "Expense added" + expense.getId();
    }


}
