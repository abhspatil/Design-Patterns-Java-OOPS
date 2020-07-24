package com.patterns.behavioural.visitor;

public class Fruit extends Item {
    String name;
    double cost;

    public Fruit(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setModel(String model) {
        this.name = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public double acccept(ShoppingcartVisitor visitor) {

        return visitor.visit(this);
    }
}
