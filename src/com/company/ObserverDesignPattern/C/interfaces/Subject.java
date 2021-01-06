package com.company.ObserverDesignPattern.C.interfaces;

public interface Subject {
    void add (Observer observer);
    void doNotify();
    void remove(Observer observer);
}
