package com.patterns.structural.decorator;

public class FullHDTV extends TVDecorator{

    public FullHDTV(TV tv) {
        super(tv);
    }

    @Override
    public void assemble() {
        System.out.println("Adding Full HD TV Features..!!");
        super.assemble();
    }
}
