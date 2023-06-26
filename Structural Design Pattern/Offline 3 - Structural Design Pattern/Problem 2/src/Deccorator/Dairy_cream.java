package Deccorator;

import Component.*;

public class Dairy_cream extends Decorator {
    Coffee coffee;
    public Dairy_cream(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Dairy cream";
    }
    public int cost() {
        return coffee.cost() + 40;
    }
}
