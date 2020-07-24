package com.patterns.structural.decorator;

public class ColorTV extends TVDecorator{

    public ColorTV(TV tv) {
        super(tv);
    }

    @Override
    public void assemble() {
        System.out.println("Adding Color TV Features..!!");
        super.assemble();
    }
}
