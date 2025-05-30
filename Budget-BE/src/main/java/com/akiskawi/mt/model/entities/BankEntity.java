package com.akiskawi.mt.model.entities;


import com.akiskawi.mt.model.Money;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection  = BankEntity.expensesCollection)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankEntity {

    public static final String expensesCollection = "banks";

    @Id
    private String id;
    private String name;
    private Money money;
    private String userId;

}
