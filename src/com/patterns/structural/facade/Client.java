package com.patterns.structural.facade;

public class Client {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Abhishek Patil","SJCE, Myore","1111111");
        customer1.addtoCart(PizzaType.CHEESNCORN);
        customer1.addtoCart(PizzaType.DELUXVEGGIE);
        customer1.order();

        System.out.println("\n\n-----------------------------*********************---------------------------");

        Customer customer2 = new Customer("Vishal Patil","kalaburagi","22222222");
        customer2.addtoCart(PizzaType.MARGHERITA);
        customer2.addtoCart(PizzaType.PAPERPENNY);
        customer2.addtoCart(PizzaType.FORMHOUSE);
        customer2.order();

        System.out.println("\n\n-----------------------------*********************---------------------------");


    }
}
