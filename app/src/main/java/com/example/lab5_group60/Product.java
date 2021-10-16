package com.example.lab5_group60;

/**
 * Created by Miguel Garzón on 2017-05-07.
 */

public class Product {
<<<<<<< HEAD
    private String _id;
    private String _productname;
    private double _price;
=======
    String name;
    double price;
    String id;

    public Product(String id, String name, double price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
>>>>>>> 019acae25cff97d9d67076b8dbe87dfaeef17351

    public Product() {
    }
    public Product(String id, String productname, double price) {
        _id = id;
        _productname = productname;
        _price = price;
    }
    public Product(String productname, double price) {
        _productname = productname;
        _price = price;
    }

    public void setId(String id) {
<<<<<<< HEAD
        _id = id;
    }
    public String getId() {
        return _id;
    }
    public void setProductName(String productname) {
        _productname = productname;
    }
    public String getProductName() {
        return _productname;
    }
=======
        this.id = id; }

    public String getId() {
        return id; }

    public void setName(String name) {
        this.name = name; }

    public String getName() {
        return name; }

>>>>>>> 019acae25cff97d9d67076b8dbe87dfaeef17351
    public void setPrice(double price) {
        _price = price;
    }
    public double getPrice() {
        return _price;
    }
}

