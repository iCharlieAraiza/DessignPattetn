package com.company.StrategyDesignPattern.B.model;

public class Product {
    private double price;
    private String upcCode;

    public Product(double price, String upcCode) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }
}
