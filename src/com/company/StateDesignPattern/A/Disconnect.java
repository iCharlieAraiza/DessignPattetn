package com.company.StateDesignPattern.A;

public class Disconnect implements Alarm {
    @Override
    public void showState() {
        System.out.println("State: The alarm is off");
    }

    @Override
    public void execute() {
        System.out.println("🔕 The alarm is disconnected.");
    }
}
