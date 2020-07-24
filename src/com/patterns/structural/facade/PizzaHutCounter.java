package com.patterns.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class PizzaHutCounter {

    private List<Pizza> orderlist = new ArrayList<>();
    private Pizza pizza = null;
    private Customer customer=null;

    public PizzaHutCounter(Customer customer){
        this.customer = customer;
    }

    public void addtoCart(PizzaType type){
        orderlist.add(order(type));
    }

    public Pizza order(PizzaType pizzaType){

        switch (pizzaType){
            case MARGHERITA:
                pizza = new Margherita();
                break;
            case FORMHOUSE:
                pizza = new FormHouse();
                break;
            case PAPERPENNY:
                pizza = new PaperPenny();
                break;
            case CHEESNCORN:
                pizza = new CheeseCorn();
                break;
            case DELUXVEGGIE:
                pizza = new DeluxVeggie();
                break;
            case CHICKENSAUSAGE:
                pizza = new ChickenSausage();
                break;
            default:
                System.out.println("Sorry.. Your Ordered Pizza Not Found");
        }

        return pizza;

    }

    public void checkOut() {
        try {
            for(Pizza pizza: orderlist) {
                pizza.cook();
            }
        }catch (NullPointerException e){
            System.out.println("Please order Something ...!!");
            e.printStackTrace();
        }

        System.out.println("Cooking Please Wait...!!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order Shipped with Details : ");
        System.out.println(customer);
        System.out.println("Order Successfully Delivered..!!");
        System.out.println("Thank you Please visit again..!!");
    }
}
