package com.rbc.itemsonsale.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.rbc.itemsonsale.ExceptionHandling.ItemNotfoundException;
import com.rbc.itemsonsale.entity.Item;
// import com.rbc.itemsonsale.entity.User;
// import com.rbc.itemsonsale.repository.UserRepository;
import com.rbc.itemsonsale.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/v1/recommendations")
public class ItemController {

    // log.info("Inside ItemController.");

    @Autowired
    private ItemService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    // @Cacheable("recommendations")
    public List<Item> list() {
        return service.listAll();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    // @Cacheable(value = "recommendations", key = "#userId")
    public Item getItem(@PathVariable("userId") Integer userId) {

        if(!userIdCheck(userId)) throw new ItemNotfoundException();
        return service.get(userId);

    }

    @RequestMapping(value = "/add-items", method = RequestMethod.POST)
    public List<Item> add(@RequestBody Item item) {
        service.save(item);
        return service.listAll();
    }

    @RequestMapping(value = "remove-item/{itemId}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable("itemId") Integer itemId) {
        if(!userIdCheck(itemId)) throw new ItemNotfoundException();
        service.delete(itemId);
    }

    private boolean userIdCheck(Integer userId){
        var allItems = service.listAll();
        var itemMap = allItems.stream().collect(Collectors.toMap(Item::getId, item -> item));
        if (!itemMap.containsKey(userId))
            return false;
        return true;
    }

    // @Autowired
    // private UserRepository userRepository;
    // private BCryptPasswordEncoder bCryptPasswordEncoder;

    

    // @RequestMapping(value = "/signup", method = RequestMethod.POST)
    // public void signUp(@RequestBody User user)
    // {
    //     System.out.println("inside signup.");
    //     user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    //     userRepository.save(user);
    // }

}
