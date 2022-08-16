package com.home.login_page;


import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/users")
    public void createUser(@Valid @RequestBody UserData userData) {
        userService.createUser(userData);
    }

    @GetMapping("/users")
    public List<UserData> showAll() {
        return userService.findAll();
    }

    @DeleteMapping("/users/{login}")
    public void deleteUser(@PathVariable String login) {
        userService.deleteByLogin(login);
    }
}
