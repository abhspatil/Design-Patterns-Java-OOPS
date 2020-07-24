package com.patterns.behavioural.mediator;

public class Client {
    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();

        Component compA = new CompA("Patil",mediator);
        Component compB = new CompB("Abhi",mediator);

        mediator.register("Patil",compA);
        mediator.register("Abhi",compB);

        compA.send("Welcome to Patil's World..!!","Abhi");
        System.out.println();
        compB.send("Hi,","Patil");
    }
}
