package com.patterns.structural.facade;

public class DeluxVeggie implements Pizza{

    @Override
    public void cook() {
        System.out.println("Order Received for Deluxe Veggie Pizza..!! ");
    }
}
