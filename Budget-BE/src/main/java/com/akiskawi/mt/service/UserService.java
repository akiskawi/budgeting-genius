package com.akiskawi.mt.service;

import com.akiskawi.mt.adapter.mapper.BudgetMapper;
import com.akiskawi.mt.model.UserDto;
import com.akiskawi.mt.model.entities.UserEntity;
import com.akiskawi.mt.repositories.UserRepository;
import com.akiskawi.mt.service.interfaces.UserInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserInterface {

    private final UserRepository userRepository;
    private final BudgetMapper mapper;

    @Override
    public UserEntity createUser(UserDto userDto) {
        return userRepository.save(mapper.mapToUserEntity(userDto));
    }
}
