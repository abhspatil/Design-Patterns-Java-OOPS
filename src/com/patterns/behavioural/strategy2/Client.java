package com.patterns.behavioural.strategy2;

public class Client {

    public static void main(String[] args) {

        Context travel = new Context(new CarStratagy());
        System.out.println(travel.execute());

        travel.setStrategy(new MetroStrategy());
        System.out.println(travel.execute());


    }
}
