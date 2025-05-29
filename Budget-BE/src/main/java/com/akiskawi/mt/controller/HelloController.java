package com.akiskawi.mt.controller;

import com.akiskawi.mt.model.ExpenseDTO;
import com.akiskawi.mt.model.entities.ExpenseEntity;
import com.akiskawi.mt.model.entities.UserEntity;
import com.akiskawi.mt.service.ExpenseService;
import com.akiskawi.mt.service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final ExpenseService expenseService;
    private final UserService userService;

    @GetMapping("/")
    public OffsetDateTime home() {
        return OffsetDateTime.now();
    }

    @GetMapping("/private")
    public UserEntity privatePage(@AuthenticationPrincipal OAuth2User principal, HttpSession session) {
        var user = userService.createUser(principal);
        session.setAttribute("id",user.getId());
        return user;
    }

    @PostMapping("/expense")
    public String createExpenses(@RequestBody ExpenseDTO expenseDTO,HttpSession session){
        expenseDTO.setUserId(session.getAttribute("id").toString());
        expenseService.createOneExpense(expenseDTO);
        return "Created";
    }

    @GetMapping("/expense/all")
    public List<ExpenseEntity> getAllExpensesOfLoggedInUser(HttpSession session){
        return expenseService.getAllOfLoggedInUser(session.getAttribute("id").toString());
    }
    @GetMapping("/expenses/month")
    public List<ExpenseEntity> getMonthlyExpenses(
            HttpSession session,
            @RequestParam int month) {
        return expenseService.getExpensesForMonth(session.getAttribute("id").toString(), 2025, month);
    }

}