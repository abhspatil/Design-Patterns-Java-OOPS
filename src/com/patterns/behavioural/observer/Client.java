package com.patterns.behavioural.observer;

public class Client {
    public static void main(String[] args) {

        RadioStation producer = new RadioStation();

        Person p1 = new Person("Patil");
        Person p2 = new Person("Abhi");

        producer.register(p1);
        producer.register(p2);

        producer.setData("A1");
        producer.setData("Patil's World");
    }
}
