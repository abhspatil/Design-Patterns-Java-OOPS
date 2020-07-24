package com.patterns.creational.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person1 = new Person("Abhishek Patil",21);
        person1.loadDetails();
        person1.getDetails();

        Person person2 = person1.clone();
        person2.setName("Vishal Patil");
        person2.setAge(18);
        person2.getDetails();

    }
}
