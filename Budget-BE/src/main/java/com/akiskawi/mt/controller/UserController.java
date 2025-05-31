package com.akiskawi.mt.controller;

import com.akiskawi.mt.model.entities.UserEntity;
import com.akiskawi.mt.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("user/create")
    public UserEntity createUser() {
        return null;
    }

}
