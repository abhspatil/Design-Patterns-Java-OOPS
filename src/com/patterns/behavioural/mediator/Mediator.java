package com.patterns.behavioural.mediator;

public interface Mediator {
    void notifyuser(String from,String to,String msg);
    void register(String name,Component component);
}
