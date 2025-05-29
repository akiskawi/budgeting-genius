package com.akiskawi.mt.adapter.mapper;

import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.entities.ExpenseEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ExpenseMapper {

    ExpenseEntity mapToEntity(ExpenseDTO expenceDTO);
}
