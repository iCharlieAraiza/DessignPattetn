package com.company.StateDesignPattern.A;

public class Alert implements Alarm {

    @Override
    public void showState() {
        System.out.println("State: The alarm is in alert mode");
    }

    @Override
    public void execute() {
        System.out.println("🚨🚨🚨🚨🚨🚨🚨🚨🚨🚨");
    }
}
