package com.patterns.behavioural.state;

public class Vibrate implements MobileAlert {
    @Override
    public void alert() {
        System.out.println("Mobile is in Vibrate Mode");
    }
}
