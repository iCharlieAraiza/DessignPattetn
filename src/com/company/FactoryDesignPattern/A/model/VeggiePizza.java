package com.company.FactoryDesignPattern.A.model;

import com.company.FactoryDesignPattern.A.interfaces.Pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie: preparando...");
    }

    @Override
    public void cook() {
        System.out.println("Veggie: cocinando...");
    }

    @Override
    public void box() {
        System.out.println("Veggie: empacando...");
    }
}
