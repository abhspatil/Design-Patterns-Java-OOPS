package com.patterns.behavioural.state;

public class Ring implements MobileAlert {
    @Override
    public void alert() {
        System.out.println("Mobile is in Ringing Mode");
    }
}
