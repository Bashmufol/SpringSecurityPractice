package com.bash.springsecex.controller;

import com.bash.springsecex.model.Users;
import com.bash.springsecex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired // Autowire the bean
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return userService.verify(user);
    }


}
