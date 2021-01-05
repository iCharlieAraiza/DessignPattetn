package com.company.ObserverDesignPattern.B.model;

import com.company.ObserverDesignPattern.B.interfaces.Observer;
import com.company.ObserverDesignPattern.B.interfaces.Subject;

public class AccountNotification implements Observer {
    private MessageInbox topic;

    public void setTopic(Subject topic){
        this.topic = (MessageInbox) topic;
    }

    @Override
    public void update() {
        if(topic.read)
            System.out.println("No hay ningún mensaje nuevo");
        else{
            System.out.println("Nuevo mensaje: "+ topic.getUpdate(this));
            topic.read = true;
        }
    }

    @Override
    public void setUpdate(Subject subject) {
        this.topic  = (MessageInbox) subject;
    }
}
