package com.patterns.structural.facade;

public class FormHouse implements Pizza{

    @Override
    public void cook() {
        System.out.println("Order Received for Form House Pizza..!! ");
    }
}
