package com.company.ObserverDesignPattern.A.model;

import com.company.ObserverDesignPattern.A.interfaces.Observer;
import com.company.ObserverDesignPattern.A.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    String name;
    Subject topic;

    public EmailTopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if (msg == null)
            System.out.println(name + " No new message on this topic!");
        else
            System.out.println(name + " Retrieving message: " + msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }

    public void EmailSuscriber(String email){

    }

}
