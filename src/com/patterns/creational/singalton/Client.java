package com.patterns.creational.singalton;

public class Client {
    public static void main(String[] args) {

        //FAANG faang=new FAANG();   Error, private constructor : 'FAANG()' has private access in 'com.patterns.creational.FAANG'
        FAANG person1 = FAANG.getInstance();
        person1.join();

        FAANG person2 = FAANG.getInstance();
        person2.join();

        System.out.println(person1 == person2);  // True : Hurray..! Joined to same group
    }
}
