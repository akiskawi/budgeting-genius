package com.akiskawi.mt.controller;

import com.akiskawi.mt.service.UtilsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final UtilsService utilsService;


    @GetMapping("/public")
    public String publicPage() {
        return "Public Page";
    }

    @GetMapping("/private")
    public String privatePage(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttribute("email");
    }


}