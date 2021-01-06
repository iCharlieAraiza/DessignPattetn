package com.company.FactoryDesignPattern.A.model;

import com.company.FactoryDesignPattern.A.interfaces.Pizza;

public class HawaiianPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Hawaiian: preparando...");
    }

    @Override
    public void cook() {
        System.out.println("Hawaiian: cocinando...");
    }

    @Override
    public void box() {
        System.out.println("Hawaiian: empacando...");
    }
}
