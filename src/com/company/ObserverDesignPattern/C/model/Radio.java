package com.company.ObserverDesignPattern.C.model;

import com.company.ObserverDesignPattern.C.interfaces.Observer;
import com.company.ObserverDesignPattern.C.interfaces.Subject;

public class Radio implements Observer {
    Station subject;

    public Radio(Subject subject){
        setSubject(subject);
    }

    public void setSubject(Subject subject){
        this.subject = (Station) subject;
    }

    @Override
    public void update(Subject subject) {
        if(this.subject == subject)
            System.out.println("Canción actual: " + this.subject.getSong() );
    }


}
