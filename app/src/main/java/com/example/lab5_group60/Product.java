package com.example.lab5_group60;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name; }

    public String getName() {
        return name; }

    public void setPrice(double price) {
        this.price = price; }

    public double getPrice() {
        return price; }
}
