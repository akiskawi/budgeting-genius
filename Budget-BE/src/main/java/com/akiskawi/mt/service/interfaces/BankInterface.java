package com.akiskawi.mt.service.interfaces;

import com.akiskawi.mt.model.BankDTO;
import com.akiskawi.mt.model.entities.BankEntity;

public interface BankInterface {
    BankEntity createBank(BankDTO bankDTO);
}
