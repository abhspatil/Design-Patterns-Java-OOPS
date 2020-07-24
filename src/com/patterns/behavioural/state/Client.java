package com.patterns.behavioural.state;

public class Client {
    public static void main(String[] args) {

        MobileRingContext state = new MobileRingContext();

        // Ring State
        state.setState(new Ring());
        state.alert();

        //Vibration State
        state.setState(new Vibrate());
        state.alert();

        //Silent State
        state.setState(new Silent());
        state.alert();
    }
}
