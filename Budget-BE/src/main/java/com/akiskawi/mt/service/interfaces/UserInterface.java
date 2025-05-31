package com.akiskawi.mt.service.interfaces;

import com.akiskawi.mt.model.UserDto;
import com.akiskawi.mt.model.entities.UserEntity;

public interface UserInterface {
    UserEntity createUser(UserDto userDto);
}
