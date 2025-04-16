package com.TODO.TODOApp.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/auth")
public class AuthController {
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // login.html
    }
    @GetMapping("/tasks")
    public String tasksPage() {
        return "redirect:/tasks"; // returns tasksPage.html
    }
}

