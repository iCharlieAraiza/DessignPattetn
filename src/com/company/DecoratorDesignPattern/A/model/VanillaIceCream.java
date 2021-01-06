package com.company.DecoratorDesignPattern.A.model;

import com.company.DecoratorDesignPattern.A.interfaces.IceCream;
import com.company.DecoratorDesignPattern.A.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Vanilla Ice-Cream!");
        return 1.0 + super.cost();
    }
}
