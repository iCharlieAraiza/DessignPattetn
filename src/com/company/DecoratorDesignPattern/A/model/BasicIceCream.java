package com.company.DecoratorDesignPattern.A.model;

import com.company.DecoratorDesignPattern.A.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating a basic Ice-Cream!");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}

