package com.hand.controller;

import com.hand.domain.User;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wankun on 2017/6/29.
 *
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User save(@RequestBody User user){
        return user;
    }

}