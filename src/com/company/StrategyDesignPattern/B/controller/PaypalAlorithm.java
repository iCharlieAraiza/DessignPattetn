package com.company.StrategyDesignPattern.B.controller;

public class PaypalAlorithm implements Payment{
    @Override
    public void pay(double amount) {System.out.println("$"+amount + " pay by Paypal");

    }
}
