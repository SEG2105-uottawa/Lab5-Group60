package com.example.lab5_group60;

public class Product {
    String name;
    double price;
    String id;

    public Product(String id, String name, double price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id; }

    public String getId() {
        return id; }

    public void setName(String name) {
        this.name = name; }

    public String getName() {
        return name; }

    public void setPrice(double price) {
        this.price = price; }

    public double getPrice() {
        return price; }
}
