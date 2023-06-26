package Deccorator;

import Component.*;

public class Cinnamon_powder extends Decorator {
    Coffee coffee;
    public Cinnamon_powder(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Cinnamon powder";
    }
    public int cost() {
        return coffee.cost() + 50;
    }
}

