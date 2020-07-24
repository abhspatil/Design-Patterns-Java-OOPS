package com.patterns.behavioural.state;

public class MobileRingContext {
    private MobileAlert mobileAlert;

    public MobileRingContext(){}

    public void setState(MobileAlert mobileAlert){
        this.mobileAlert = mobileAlert;
    }

    public void alert(){
        this.mobileAlert.alert();
    }
}
