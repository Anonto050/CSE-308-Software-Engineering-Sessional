package Deccorator;

import Component.*;

public class Chocolate_sauce extends Decorator {
    Coffee coffee;
    public Chocolate_sauce(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate sauce";
    }
    public int cost() {
        return coffee.cost() + 60;
    }
}
