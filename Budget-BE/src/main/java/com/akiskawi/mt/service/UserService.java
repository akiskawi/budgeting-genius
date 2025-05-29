package com.akiskawi.mt.service;

import com.akiskawi.mt.model.entities.UserEntity;
import com.akiskawi.mt.repository.UserRepository;
import com.akiskawi.mt.service.interfaces.UserServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserServiceInterface {

    private final UserRepository userRepository;
    @Override
    public UserEntity createUser(OAuth2User principal) {
        //Sign in if already exists
        Optional<UserEntity> user = userRepository.findByEmail(principal.getAttributes().get("email").toString());
        return user.orElseGet(() -> userRepository.save(
                UserEntity.builder()
                        .email(principal.getAttributes().get("email").toString())
                        .firstName(principal.getAttributes().get("given_name").toString())
                        .lastName(principal.getAttributes().get("family_name").toString())
                        .createdAt(LocalDateTime.now())
                        .picture(principal.getAttributes().get("picture").toString())
                        .build()
        ));

    }
}
