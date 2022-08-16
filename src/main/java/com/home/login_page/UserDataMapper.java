package com.home.login_page;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserDataMapper implements Function<UserEntity,UserData> {

    @Override
    public UserData apply(UserEntity userEntity) {
        UserData userData = new UserData();
        userData.setLogin(userEntity.getLogin());
        userData.setPassword(userEntity.getPassword());
        return userData;
    }
}
