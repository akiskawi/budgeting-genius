package com.akiskawi.mt.service;

import com.akiskawi.mt.adapter.mapper.ExpenseMapper;
import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.Money;
import com.akiskawi.mt.model.MoneyEnum;
import com.akiskawi.mt.model.entities.ExpenseEntity;
import com.akiskawi.mt.repository.ExpenseRepository;
import com.akiskawi.mt.service.interfaces.ExpenseServiceInterface;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService implements ExpenseServiceInterface {

    private final ExpenseRepository expenseRepository;
    private final ExpenseMapper mapper;


    @Override
    public ExpenseEntity createOneExpense(ExpenseDTO dto) {
        if (dto.getMoney().getCurrency()== null){
            dto.setMoney(Money.builder().cost(dto.getMoney().getCost()).currency(MoneyEnum.EURO).build());
        }
        dto.setTimeOfExpense(LocalDateTime.now());
        return expenseRepository.save(mapper.mapToEntity(dto));
    }

    @Override
    public List<ExpenseEntity> getAllOfLoggedInUser(String userId) {
        return expenseRepository.findByUserId(userId);
    }

    @Override
    public List<ExpenseEntity> getExpensesForMonth(String userId, int year, int month) {
        LocalDateTime start = LocalDateTime.of(year, month, 1, 0, 0);
        LocalDateTime end = start.plusMonths(1); // Exclusive end of range
        return expenseRepository.findByUserIdAndTimeOfExpenseBetween(userId,start,end);
    }


}
