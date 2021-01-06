package com.company.ObserverDesignPattern.C.model;

import com.company.ObserverDesignPattern.C.interfaces.Observer;
import com.company.ObserverDesignPattern.C.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Station implements Subject {
    private String name;
    private String song;
    private List<Observer> observers = new ArrayList<>();

    public Station(){
        name = "Música para todos";
    }

    public String getSong(){
        return song;
    }

    public Object getUpdate(Observer observer) {
        return null;
    }

    public void changeSong(String newSong){
        this.song = newSong;
        doNotify();
    }

    @Override
    public void add(Observer observer) {
        if(observers.contains(observer))
            return;
        else
            observers.add(observer);
    }

    @Override
    public void doNotify() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

}
