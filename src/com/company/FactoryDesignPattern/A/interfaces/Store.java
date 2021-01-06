package com.company.FactoryDesignPattern.A.interfaces;

public abstract class Store {

    public void ordePizza(String type){
        Pizza pizza = createPizza(type);

        if(pizza==null){
            return;
        }

        pizza.prepare();
        pizza.cook();
        pizza.box();

        System.out.println("Ok, tu pizza está terminada!! 👌"+"\n");

    }

    public abstract Pizza createPizza(String type);
}
