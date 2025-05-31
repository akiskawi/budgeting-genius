package com.akiskawi.mt.adapter.mapper;

import com.akiskawi.mt.model.BankDTO;
import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.UserDto;
import com.akiskawi.mt.model.entities.BankEntity;
import com.akiskawi.mt.model.entities.ExpenseEntity;
import com.akiskawi.mt.model.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BudgetMapper {

    ExpenseEntity mapToExpenseEntity(ExpenseDTO expenseDTO);

    BankEntity mapToBankEntity(BankDTO bankDTO);

    UserEntity mapToUserEntity(UserDto userDto);

}
