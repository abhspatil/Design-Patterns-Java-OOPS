package com.patterns.behavioural.mediator;

public interface Component {
    void send(String msg, String user);
    void recieve(String msg,String from);
}
