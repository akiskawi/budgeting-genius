package com.akiskawi.mt.service.interfaces;

import com.akiskawi.mt.model.entities.UserEntity;
import org.springframework.security.oauth2.core.user.OAuth2User;

public interface UserServiceInterface {

    UserEntity createUser(OAuth2User principal);
}
