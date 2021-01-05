package com.company.StrategyDesignPattern.B.controller;

import com.company.StrategyDesignPattern.B.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList = new ArrayList<>();



    public void addItem(Product product){ productList.add(product); }

    public void removeItem(Product product){ productList.remove(product); }


    private double calculateAmount(){
        double amount = 0;

        for (Product product : productList){
            amount = amount + product.getPrice();
        }

        return amount;
    }



    public void pay(Payment payment){
        payment.pay(calculateAmount());
    }

}
