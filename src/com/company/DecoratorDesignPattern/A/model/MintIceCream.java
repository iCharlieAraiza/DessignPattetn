package com.company.DecoratorDesignPattern.A.model;

import com.company.DecoratorDesignPattern.A.interfaces.IceCream;
import com.company.DecoratorDesignPattern.A.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {

    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost(){
        return super.cost() + 1.5;
    }
}
