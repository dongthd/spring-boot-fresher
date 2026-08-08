package com.springboot.fresher.service;

import com.springboot.fresher.entity.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);

    List<UserEntity> getAllUsers();

    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    // Get all by limit offset
    Page<UserEntity> findAllUsers(Pageable pageable);

    // Get search by limit offset
    Page<UserEntity> findByUserName(String userName, Pageable pageable);
}
