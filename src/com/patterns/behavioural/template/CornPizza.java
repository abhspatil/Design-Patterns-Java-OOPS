package com.patterns.behavioural.template;

public class CornPizza extends PizzaMaker {
        @Override
        public void selectBread() {
            System.out.println("Choosing Bread for Corn Pizza");
        }

        @Override
        public void chooseIngredients() {
            System.out.println("Adding Ingredients for Corn Pizza");
        }

        @Override
        public void bakeAtTemperature() {
            System.out.println("Baking at temperature for Corn Pizza");
        }

        @Override
        public void addToppings() {
            System.out.println("Adding toppings for Corn Pizza");
        }

        @Override
        public void addCheese() {
            System.out.println("Adding Cheese for Corn Pizza");
        }

        @Override
        public void makePizza() {
            super.makePizza();
        }
}
