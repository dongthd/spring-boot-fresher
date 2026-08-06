package com.springboot.fresher.controller.user;

import com.springboot.fresher.entity.user.UserEntity;
import com.springboot.fresher.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @GetMapping("/search")
    public UserEntity searchUser(@RequestParam String userName,
                                 @RequestParam String userEmail) {
        return userService.findByUserNameAndUserEmail(userName, userEmail);
    }
}
