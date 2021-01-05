package com.company.SingletonPattern;

public class MyClass {
    private static MyClass uniqueInstance = new MyClass();
    private String name;



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void alert(){
        System.out.println("Hello!!");
    }

    static public MyClass getInstance(){
        return uniqueInstance;
    }
}
