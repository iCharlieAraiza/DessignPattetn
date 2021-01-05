package com.company.ObserverDesignPattern.B.interfaces;

public interface Subject {
    //Métodos para el push
    public void register(Observer observer);
    public void unregister(Observer observer);
    void notifyObserver();

    //Método para el pull
    public Object getUpdate(Observer observer);
}
