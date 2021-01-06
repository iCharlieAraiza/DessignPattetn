package com.company.FactoryDesignPattern.A.model;

import com.company.FactoryDesignPattern.A.interfaces.Pizza;

public class MidPepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Mid Pepperoni: preparando...");
    }

    @Override
    public void cook() {
        System.out.println("Mid Pepperoni: cocinando...");
    }

    @Override
    public void box() {
        System.out.println("Mid Pepperoni: empacando...");
    }
}
