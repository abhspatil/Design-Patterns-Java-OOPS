package com.patterns.structural.facade;

public class ChickenSausage implements Pizza{

    @Override
    public void cook() {
        System.out.println("Order Received for Paper Chicken Sausage Pizza..!! ");
    }

}
