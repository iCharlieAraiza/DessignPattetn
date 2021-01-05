package com.company.StrategyDesignPattern.A.model;

import com.company.StrategyDesignPattern.A.controller.CalculateAlgorithm;

public class Triangle implements CalculateAlgorithm {
    @Override
    public double calculateArea(float value) {
        return (value*value) / 2;
    }
}
