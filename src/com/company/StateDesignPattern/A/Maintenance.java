package com.company.StateDesignPattern.A;

public class Maintenance implements Alarm {
    @Override
    public void showState() {
        System.out.println("State: The alarm is in maintenance.");
    }

    @Override
    public void execute() {
        System.out.println("👷 The alarm is in maintenance mode. Try later.");
    }
}
