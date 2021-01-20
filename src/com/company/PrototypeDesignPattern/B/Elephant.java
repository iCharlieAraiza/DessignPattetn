package com.company.PrototypeDesignPattern.B;

import com.company.PrototypeDesignPattern.Animal;
import com.sun.xml.internal.xsom.impl.AnnotationImpl;

public class Elephant implements Animal {

    private String name;
    private double weight;

    public Elephant(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public Animal clone() {
        Animal animal = null;
        try {
            animal = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return animal;
    }
}
