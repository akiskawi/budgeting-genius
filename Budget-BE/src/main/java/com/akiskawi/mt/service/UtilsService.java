package com.akiskawi.mt.service;

import com.akiskawi.mt.model.entities.BankEntity;
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

    private final UserEntity userEntity = UserEntity.builder().id("1").email("joe@doe.com").picture("pictureUrl").lastName("Doe").firstName("Joe").build();
    private final BankEntity bankEntity = BankEntity.builder().id("1").money(100.0).name("Eurobank").userId("1").build();

    @Override
    public void initMongoDb() {
        userRepository.save(userEntity);
        bankRepository.save(bankEntity);

    }

    @Override
    public void clearMongoDb() {
        userRepository.deleteAll();
        expenseRepository.deleteAll();
        bankRepository.deleteAll();

    }

}
