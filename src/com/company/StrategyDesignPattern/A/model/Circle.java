package com.company.StrategyDesignPattern.A.model;

import com.company.StrategyDesignPattern.A.controller.CalculateAlgorithm;

public class Circle implements CalculateAlgorithm {
    @Override
    public double calculateArea(float value) {
        return (value*value*Math.PI);
    }
}
