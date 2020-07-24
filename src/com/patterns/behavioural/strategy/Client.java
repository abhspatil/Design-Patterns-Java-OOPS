package com.patterns.behavioural.strategy;

public class Client {
    public static void main(String[] args) {

        StratagyContext context = new StratagyContext();

        context.setAB(10,6);

        context.execute(new Add());
        context.execute(new Substract());
        context.execute(new Mod());
        context.execute(new Multiply());

    }
}
