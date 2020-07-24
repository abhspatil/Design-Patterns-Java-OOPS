package com.patterns.behavioural.state;

public class Silent implements MobileAlert {
    @Override
    public void alert() {
        System.out.println("Mobile is in Silent Mode");
    }
}
