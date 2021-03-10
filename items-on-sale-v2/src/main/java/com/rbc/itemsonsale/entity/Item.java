package com.rbc.itemsonsale.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    
    private int id;
    private String name;
    private String description;
    private float price;
    private String category;
    private float userRating;
    private float globalRating;

    // @Autowired
    // Laptop laptop;

    public Item(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getUserRating() {
        return userRating;
    }
    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }
    public float getGlobalRating() {
        return globalRating;
    }
    public void setGlobalRating(float globalRating) {
        this.globalRating = globalRating;
    }

    public Item(int id, String name, String description, float price, String category, float userRating,
            float globalRating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.userRating = userRating;
        this.globalRating = globalRating;
    }

    
}
