package com.learning.Learning.controller;

import ch.qos.logback.core.joran.spi.HttpUtil;
import com.learning.Learning.entity.UserE;
import com.learning.Learning.pojo.Users;
import com.learning.Learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public Optional<UserE> getUserDetails(@PathVariable Long id){
        return userService.getData(id);
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public String saveUserDetails(@RequestBody Users users){
        return userService.saveUserData(users);

    }


}
