package com.rbc.itemsonsale.repository;

import com.rbc.itemsonsale.entity.Item;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    
}
