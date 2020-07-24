package com.patterns.behavioural.visitor;

public class Computer extends Item {
    String model;
    double cost;

    public Computer(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
