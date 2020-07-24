package com.patterns.behavioural.template;

public abstract class PizzaMaker {
    public abstract void selectBread();
    public abstract void chooseIngredients();
    public abstract void bakeAtTemperature();
    public abstract void addToppings();
    public abstract void addCheese();

    public void makePizza(){
        selectBread();
        chooseIngredients();
        bakeAtTemperature();
        addToppings();
        addCheese();

        System.out.println("Your Pizza is Ready");
    }

}
