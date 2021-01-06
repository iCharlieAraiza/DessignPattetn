package com.company.FactoryDesignPattern.A.model;

import com.company.FactoryDesignPattern.A.interfaces.Pizza;
import com.company.FactoryDesignPattern.A.interfaces.Store;

public class RegularStore extends Store {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza  = null;

        switch (type) {
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "hawaiian":
                pizza = new HawaiianPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                System.out.println("¡Ups! Has agregado una opción no válida");
                break;
        }

        return pizza;
    }
}
