package com.akiskawi.mt.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankDTO {

    private String name;
    private Double money;
    private String userId;

}
