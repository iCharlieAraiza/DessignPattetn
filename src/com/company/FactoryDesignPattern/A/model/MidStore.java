package com.company.FactoryDesignPattern.A.model;

import com.company.FactoryDesignPattern.A.interfaces.Pizza;
import com.company.FactoryDesignPattern.A.interfaces.Store;

public class MidStore extends Store {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza  = null;

        switch (type){
            case "hawaiian":
                pizza = new HawaiianPizza();
                break;
            case "pepperoni":
                pizza = new MidPepperoniPizza();
                break;
            default:
                System.out.println("¡Ups! Has agregado una opción no válida");
        }

        return pizza;
    }
}
