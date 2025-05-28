package com.akiskawi.mt.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome! <a href=\"/oauth2/authorization/github\">Login with GitHub</a>";
    }

    @GetMapping("/private")
    public String privatePage(@AuthenticationPrincipal OAuth2User principal) {
        return "Hello, " + principal.getName();
    }
}