package com.patterns.behavioural.visitor;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Item> items = Arrays.asList( new Computer("HP",10000),
                                          new Computer("DELL",5000),
                                          new Fruit("Banana",100)
                                        );


        calculatePrice(items);
    }

    public static void calculatePrice(List<Item> items){
        ShoppingcartVisitor shoppingcartVisitor = new ShoppingCartVisitorImpl();

        double cost=0;
        for (Item item:items){
            cost+= item.acccept(shoppingcartVisitor);
        }

        System.out.println("Total Cart Cost : "+cost);
    }

}
