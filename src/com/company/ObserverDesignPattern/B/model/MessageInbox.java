package com.company.ObserverDesignPattern.B.model;

import com.company.ObserverDesignPattern.B.interfaces.Observer;
import com.company.ObserverDesignPattern.B.interfaces.Subject;

public class MessageInbox implements Subject {
    Observer observer;
    String message;
    public Boolean read = true;

    public MessageInbox(Observer observer){
        this.observer = observer;
    }

    @Override
    public void register(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void unregister(Observer observer) {
        if(observer == this.observer){
            this.observer = null;
        }
    }

    @Override
    public void notifyObserver() {
        read = false;
        observer.update();
    }

    @Override
    public Object getUpdate(Observer observer) {
        return message;
    }

    public void newMessage(String message){
        this.message = message;
        notifyObserver();
    }

}
