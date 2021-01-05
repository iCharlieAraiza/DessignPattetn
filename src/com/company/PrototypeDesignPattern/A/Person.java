package com.company.PrototypeDesignPattern.A;

import com.company.PrototypeDesignPattern.Animal;

public class Person implements Animal {
    
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public Animal clone() {
        return new Person(name, age);
    }
}
