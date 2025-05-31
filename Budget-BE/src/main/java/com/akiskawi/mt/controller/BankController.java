package com.akiskawi.mt.controller;

import com.akiskawi.mt.model.BankDTO;
import com.akiskawi.mt.model.entities.BankEntity;
import com.akiskawi.mt.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BankController {

    private final BankService bankService;

    @PostMapping("/bank/create")
    public BankEntity createNewBank(@RequestBody BankDTO bankDTO) {
        return bankService.createBank(bankDTO);
    }
}
