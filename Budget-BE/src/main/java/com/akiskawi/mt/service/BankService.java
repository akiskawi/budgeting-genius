package com.akiskawi.mt.service;

import com.akiskawi.mt.adapter.mapper.BudgetMapper;
import com.akiskawi.mt.model.BankDTO;
import com.akiskawi.mt.model.entities.BankEntity;
import com.akiskawi.mt.repositories.BankRepository;
import com.akiskawi.mt.service.interfaces.BankInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BankService implements BankInterface {

    private final BankRepository bankRepository;
    private final BudgetMapper mapper;

    @Override
    public BankEntity createBank(BankDTO bankDTO) {
        return bankRepository.save(mapper.mapToBankEntity(bankDTO));
    }
}
