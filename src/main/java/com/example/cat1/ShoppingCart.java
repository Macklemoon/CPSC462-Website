package com.example.cat1;

public class ShoppingCart {
    public String id;
    public String filename;
    public String description;

    public ShoppingCart() {

    }

    public ShoppingCart(String id, String filename, String description) {
        this.id = id;
        this.filename = filename;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id='" + id + '\'' +
                ", filename='" + filename + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
