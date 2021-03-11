package com.rbc.itemsonsale.service;

import java.util.List;

import javax.transaction.Transactional;

import com.rbc.itemsonsale.entity.Item;
import com.rbc.itemsonsale.repository.ItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ItemService {
    @Autowired
    private ItemRepository repo;

    @Cacheable("itemsCache")
    public List<Item> listAll() {
        return repo.findAll();
    }
     
    public void save(Item product) {
        repo.save(product);
    }
     
    public Item get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
