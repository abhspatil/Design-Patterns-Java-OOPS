package com.patterns.structural.facade;

public class PaperPenny implements Pizza{

    @Override
    public void cook() {
        System.out.println("Order Received for Paper Penny Pizza..!! ");
    }
}
