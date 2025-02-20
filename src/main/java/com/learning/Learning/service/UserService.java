package com.learning.Learning.service;

import com.learning.Learning.entity.UserE;
import com.learning.Learning.pojo.Users;
import com.learning.Learning.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Optional<UserE> getData(Long id){
        Optional<UserE> data = userRepo.findById(id);
        return data;
    }

    public String saveUserData(Users users){
        UserE obj = new UserE();
        obj.setUserName(users.getUserName());
        obj.setUserAddress(users.getUserAddress());
        obj.setUserPosition(users.getUserPosition());
        obj.setUserMobileNumber(users.getUserMobileNumber());
        userRepo.save(obj);

        return "USERS DATA SAVED SUCCESSFULLY" + obj.getUserId();
    }
}
