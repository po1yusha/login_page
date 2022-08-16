package com.home.login_page;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class LoginPageRunner implements CommandLineRunner {

    private UserService userService;

    @Override
    public void run(String... args) throws Exception {
        userService.createUser(new UserData("cat", "123"));
        userService.createUser(new UserData("dog", "123"));
        userService.createUser(new UserData("Arina", "123"));
        userService.createUser(new UserData("Polina", "123"));
    }
}
