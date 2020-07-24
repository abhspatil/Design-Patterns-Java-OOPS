package com.patterns.behavioural.strategy;

public class Mod implements Operation{
    @Override
    public void execute(int a, int b) {
        System.out.println("Result of Mod of ("+a+","+b+") : "+(a%b));
    }
}
