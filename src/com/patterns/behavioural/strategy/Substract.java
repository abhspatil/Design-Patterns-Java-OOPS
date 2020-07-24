package com.patterns.behavioural.strategy;

public class Substract implements Operation{

    @Override
    public void execute(int a, int b) {
        System.out.println("Result of Subtraction of ("+a+","+b+") : "+(a-b));
    }
}
