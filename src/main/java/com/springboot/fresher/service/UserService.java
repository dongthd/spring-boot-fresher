package com.springboot.fresher.service;

import com.springboot.fresher.entity.user.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);
    List<UserEntity> getAllUsers();
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);
}
