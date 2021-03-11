package com.rbc.itemsonsale.repository;

import com.rbc.itemsonsale.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
