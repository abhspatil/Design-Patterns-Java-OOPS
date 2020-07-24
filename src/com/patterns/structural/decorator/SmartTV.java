package com.patterns.structural.decorator;

public class SmartTV extends TVDecorator{

    public SmartTV(TV tv) {
        super(tv);
    }

    @Override
    public void assemble() {
        System.out.println("Adding Smart TV Features..!!");
        super.assemble();
    }
}
