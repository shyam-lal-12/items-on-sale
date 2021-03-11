package com.rbc.itemsonsale.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private float price;
    private int categoryId;
    private String categoryName;
    private float userRating;
    private float globalRating;

    // @Autowired
    // Laptop laptop;

    public Item(){

    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public Item(int id, String name, String description, float price, int categoryId, String categoryName, float userRating,
            float globalRating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.userRating = userRating;
        this.globalRating = globalRating;
    }

    
}
