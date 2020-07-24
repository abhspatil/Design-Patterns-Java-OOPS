package com.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class RadioStation implements  Subject{

    List<Observer> observers;
    String data;

    public RadioStation(){
        observers = new ArrayList<>();
        data="Welcomes to patil's world...";
    }

    public void setData(String data){
        this.data=data;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for( Observer o : observers){
            o.notify(this.data);
        }

    }
}
