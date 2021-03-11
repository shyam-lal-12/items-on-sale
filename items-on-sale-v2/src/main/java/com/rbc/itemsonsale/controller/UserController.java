package com.rbc.itemsonsale.controller;

import com.rbc.itemsonsale.entity.User;
import com.rbc.itemsonsale.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/user-auth")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    // public UserController(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder)
    // {
    //     this.userRepository = userRepository;
    //     this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    // }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void signUp(@RequestBody User user)
    {
        System.out.println("inside signup.");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
    
}
