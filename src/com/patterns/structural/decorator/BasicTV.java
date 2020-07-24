package com.patterns.structural.decorator;

public class BasicTV implements TV{

    @Override
    public void assemble() {
        System.out.println("Assembling Basic TV");
        System.out.println("Manufacturing of TV Completed .. Ready For Shipping..!!");
    }

}
