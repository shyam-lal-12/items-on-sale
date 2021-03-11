package com.rbc.itemsonsale.service;

import javax.transaction.Transactional;

import com.rbc.itemsonsale.entity.User;
import com.rbc.itemsonsale.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository repo;

    public void save(User user) {
        repo.save(user);
    }
}
