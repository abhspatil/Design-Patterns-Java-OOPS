package com.patterns.behavioural.strategy;

public class Multiply implements Operation{

    @Override
    public void execute(int a, int b) {
        System.out.println("Result of Multiplication of ("+a+","+b+") : "+(a*b));
    }
}
