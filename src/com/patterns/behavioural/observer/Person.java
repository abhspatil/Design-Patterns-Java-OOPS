package com.patterns.behavioural.observer;

public class Person implements Observer{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void notify(String s) {
        System.out.println("Notifying User : "+this.name);
        System.out.println("Recived Data : "+s);

    }
}
