package com.patterns.behavioural.template;

public class Client {
    public static void main(String[] args) {

        CheesePizza cheesePizza = new CheesePizza();
        cheesePizza.makePizza();

        System.out.println("------------------------*********************--------------------");

        CornPizza cornPizza = new CornPizza();
        cornPizza.makePizza();

    }
}
