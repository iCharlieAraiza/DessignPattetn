package com.company.DecoratorDesignPattern.A.model;

import com.company.DecoratorDesignPattern.A.interfaces.IceCream;
import com.company.DecoratorDesignPattern.A.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {

    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost(){
        return 1.0 + super.cost();
    }

}

