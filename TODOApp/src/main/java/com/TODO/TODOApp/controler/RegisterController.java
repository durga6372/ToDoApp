package com.TODO.TODOApp.controler;
import com.TODO.TODOApp.model.User;
import com.TODO.TODOApp.repositary.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/auth")
public class RegisterController {
    private final UserRepository userRepo;
    private final BCryptPasswordEncoder encoder;
    public RegisterController(UserRepository userRepo, BCryptPasswordEncoder encoder) {
        this.userRepo = userRepo;
        this.encoder = encoder;
    }
    @GetMapping("/register")
    public String registerPage() {
        return "register"; // register.html
    }
    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(encoder.encode(password));
        userRepo.save(user);
        return "redirect:/auth/login";
    }
}

