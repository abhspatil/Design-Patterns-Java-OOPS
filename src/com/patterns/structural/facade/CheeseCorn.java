package com.patterns.structural.facade;

public class CheeseCorn implements Pizza{

    @Override
    public void cook() {
        System.out.println("Order Received for Cheese Corn..!! ");
    }
}
