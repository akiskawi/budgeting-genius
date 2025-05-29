package com.akiskawi.mt.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MoneyEnum {
    EURO("€"),
    DOLLAR("$");

    public final String symbol;

}
