package com.patterns.structural.decorator;

public class TVDecorator implements TV {

    protected TV tv;
    public TVDecorator(TV tv){
        this.tv = tv;
    }

    @Override
    public void assemble() {
        this.tv.assemble();
    }
}
