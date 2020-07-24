package com.patterns.structural.decorator;

public class HDTV extends TVDecorator{

    public HDTV(TV tv) {
        super(tv);
    }

    @Override
    public void assemble() {
        System.out.println("Adding HD TV Features..!!");
        super.assemble();
    }
}
