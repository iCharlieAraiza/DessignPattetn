package com.company.StrategyDesignPattern.B.controller;


public class CreditCard implements Payment {

    private String email;
    private String password;

    public CreditCard(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " pay by credit card");
    }
}
