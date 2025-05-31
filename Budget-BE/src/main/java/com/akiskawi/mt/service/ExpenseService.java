package com.akiskawi.mt.service;

import com.akiskawi.mt.adapter.mapper.BudgetMapper;
import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.entities.BankEntity;
import com.akiskawi.mt.model.entities.ExpenseEntity;
import com.akiskawi.mt.repositories.BankRepository;
import com.akiskawi.mt.repositories.ExpenseRepository;
import com.akiskawi.mt.service.interfaces.ExpenseInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExpenseService implements ExpenseInterface {

    private final ExpenseRepository expenseRepository;
    private final BankRepository bankRepository;
    private final BudgetMapper mapper;

    @Override
    public ExpenseEntity addExpense(ExpenseDTO expenseDTO) throws Exception {
        log.info("Add Expense started");
        //logic

        // get bank if user doesnt have bank throw an error
        Optional<BankEntity> potentialBankOfUser = bankRepository.findById(expenseDTO.getBankId());
        if (potentialBankOfUser.isEmpty()) {
            log.error("Error loading the bank of User, Maybe the User does not have a bank register to him");
            throw new Exception("Error loading the bank of User, Maybe the User does not have a bank register to him");
        }
        BankEntity bankOfUser = potentialBankOfUser.get();

        // remove the money from the bank if negative throw an error
        if (bankOfUser.getMoney() < expenseDTO.getMoney()) {
            log.error("Error money in the bank is not enough");
            throw new Exception("Error money in the bank is not enough");
        }
        bankOfUser.setMoney(bankOfUser.getMoney() - expenseDTO.getMoney());
        bankRepository.save(bankOfUser);

        log.info("Add Expense Ended");
        return expenseRepository.save(mapper.mapToExpenseEntity(expenseDTO));
    }


}
