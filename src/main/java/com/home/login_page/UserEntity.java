package com.home.login_page;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private String login;
    private String password;
}
