package com.example.btlandroid.Domain;

import java.io.Serializable;

public class ItemDomain implements Serializable {
    private String Title;
    private String ImagePath;
    private String Description;
    private double Price;
    private double Star;
    private int Id;
    private int CategoryId;
    private int LocationId;
    private String category = "Tất cả";  // Initialize with default value

    public ItemDomain() {

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getStar() {
        return Star;
    }

    public void setStar(double star) {
        Star = star;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getLocationId() {
        return LocationId;
    }

    public void setLocationId(int locationId) {
        LocationId = locationId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;  
    }

    // Add this method to get productId as String (converting from int id)
    public String getProductId() {
        return String.valueOf(Id);
    }
}

