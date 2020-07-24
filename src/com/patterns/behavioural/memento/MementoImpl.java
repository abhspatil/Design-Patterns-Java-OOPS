package com.patterns.behavioural.memento;

public class MementoImpl  implements Memento {

    String state;

    public MementoImpl(String s){
        this.state=s;
    }

    @Override
    public void setState(String s) {
        this.state=s;
    }

    @Override
    public String getState() {
        return this.state;
    }
}
