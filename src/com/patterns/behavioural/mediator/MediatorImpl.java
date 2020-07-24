package com.patterns.behavioural.mediator;

import java.util.HashMap;
import java.util.Map;

public class MediatorImpl  implements Mediator{

    Map<String,Component> userdb = new HashMap<>();

    public MediatorImpl(){
        System.out.println("Mediator Instantiated..");
    }

    @Override
    public void notifyuser(String from,String to,String msg) {
        System.out.println("Notifying User : "+ to);
        userdb.get(to).recieve(msg,from);
    }

    @Override
    public void register(String name, Component component) {
        userdb.put(name,component);
    }
}
