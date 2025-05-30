package com.akiskawi.mt.service;

import com.akiskawi.mt.model.entities.BankEntity;
import com.akiskawi.mt.model.entities.ExpenseEntity;
import com.akiskawi.mt.model.entities.UserEntity;
import com.akiskawi.mt.repositories.BankRepository;
import com.akiskawi.mt.repositories.ExpenseRepository;
import com.akiskawi.mt.repositories.UserRepository;
import com.akiskawi.mt.service.interfaces.UtilsInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtilsService implements UtilsInterface {

    private final UserRepository userRepository;
    private final ExpenseRepository expenseRepository;
    private final BankRepository bankRepository;

    private UserEntity userEntity = UserEntity.builder().build();
    private ExpenseEntity expenseEntity = ExpenseEntity.builder().build();
    private BankEntity bankEntity = BankEntity.builder().build();

    @Override
    public void initMongoDb() {
        userRepository.save(userEntity);
        expenseRepository.save(expenseEntity);
        bankRepository.save(bankEntity);

    }

    @Override
    public void clearMongoDb() {
        userRepository.deleteAll();
        expenseRepository.deleteAll();
        bankRepository.deleteAll();

    }

}
