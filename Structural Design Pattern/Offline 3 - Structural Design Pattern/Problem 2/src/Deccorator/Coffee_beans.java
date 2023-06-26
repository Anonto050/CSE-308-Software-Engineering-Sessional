package Deccorator;

import Component.*;

public class Coffee_beans extends Decorator {
    Coffee coffee;
    public Coffee_beans(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Additional coffee beans";
    }
    public int cost() {
        return coffee.cost() + 30;
    }
}
