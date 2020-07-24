package com.patterns.behavioural.strategy;

public class Add implements Operation{

    @Override
    public void execute(int a, int b) {
        System.out.println("Result of Addition of ("+a+","+b+") : "+(a+b));
    }
}
