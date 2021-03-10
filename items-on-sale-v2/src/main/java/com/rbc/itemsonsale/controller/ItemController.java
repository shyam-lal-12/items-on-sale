package com.rbc.itemsonsale.controller;

import java.util.List;

import com.rbc.itemsonsale.entity.Item;
import com.rbc.itemsonsale.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService service;

    @GetMapping("/items")
    public List<Item> list() {
        return service.listAll();
    }

}
