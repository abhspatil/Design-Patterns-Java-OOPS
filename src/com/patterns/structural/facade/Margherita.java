package com.patterns.structural.facade;

public class Margherita implements Pizza{

    @Override
    public void cook() {
        System.out.println("Order Received for Margarita..!! ");
    }
}
