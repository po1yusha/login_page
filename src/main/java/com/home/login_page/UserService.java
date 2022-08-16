package com.home.login_page;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private UserDataMapper userDataMapper;

    public void createUser(UserData userData) {
        UserEntity userEntity = new UserEntity();
        userEntity.setLogin(userData.getLogin());
        userEntity.setPassword(userData.getPassword());

        userRepository.save(userEntity);
    }

    public List<UserData> findAll() {

        return userRepository.findAll().stream()
                .map(userDataMapper)
                .collect(Collectors.toList());
    }

    public void deleteByLogin(String login) {
        userRepository.deleteById(login);
    }


}
