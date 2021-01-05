package com.company.StrategyDesignPattern.A.controller;

public class CalculatorController {

    public CalculateAlgorithm shape;

    public void showResult(float value){
        System.out.println("EL área de la figura: "+ shape.calculateArea(value));
    }

}
