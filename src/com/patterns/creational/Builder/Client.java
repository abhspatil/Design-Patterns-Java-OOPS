package com.patterns.creational.Builder;

public class Client {

    public static void main(String[] args) {

        Phone phone = new PhoneBuilder().setName("MI Note 5 Pro").setBrand("MI").setRam("8 GB").getPhone();
        System.out.println(phone);

        phone = new PhoneBuilder().setName("IPHONE").setBrand("IOS").getPhone();
        System.out.println(phone);

    }
}
