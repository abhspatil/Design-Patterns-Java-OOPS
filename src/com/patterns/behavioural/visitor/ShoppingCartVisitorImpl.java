package com.patterns.behavioural.visitor;

public class ShoppingCartVisitorImpl implements ShoppingcartVisitor {

    @Override
    public double visit(Computer computer) {
        double cost = computer.getCost();

        if(cost>1000){
            cost=cost*.17;
            System.out.println("Added Discount ..!!");
        }

        System.out.println("Computer Model : "+computer.getModel()+" || Cost : "+cost);
        return cost;
    }

    @Override
    public double visit(Fruit fruit) {
        double cost= fruit.getCost();
        System.out.println("Fruit name : "+fruit.getName()+" || Cost : "+cost);

        return cost;
    }
}
