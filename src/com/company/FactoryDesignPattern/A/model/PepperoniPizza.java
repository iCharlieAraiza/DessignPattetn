package com.company.FactoryDesignPattern.A.model;

import com.company.FactoryDesignPattern.A.interfaces.Pizza;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pepperoni: preparando...");
    }

    @Override
    public void cook() {
        System.out.println("Pepperoni: cocinando...");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni: empacando...");
    }
}
