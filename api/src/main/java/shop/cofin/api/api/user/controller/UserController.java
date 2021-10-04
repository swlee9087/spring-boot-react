package shop.cofin.api.api.user.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.cofin.api.api.user.domain.User;
import shop.cofin.api.api.user.service.UserService;
import shop.cofin.api.api.user.service.UserServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController @RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/users/{userId}")
    public Optional<User> findById(@PathVariable long userId){
        return userService.findById(userId);
    }
}
