package com.patterns.behavioural.template;

public class CheesePizza extends PizzaMaker {
        @Override
        public void selectBread() {
            System.out.println("Choosing Bread for Cheese Pizza");
        }

        @Override
        public void chooseIngredients() {
            System.out.println("Adding Ingredients for Cheese Pizza");
        }

        @Override
        public void bakeAtTemperature() {
            System.out.println("Baking at temperature for Cheese Pizza");
        }

        @Override
        public void addToppings() {
            System.out.println("Adding toppings for Cheese Pizza");
        }

        @Override
        public void addCheese() {
            System.out.println("Adding Cheese for Cheese Pizza");
        }

        @Override
        public void makePizza() {
            super.makePizza();
        }
}
