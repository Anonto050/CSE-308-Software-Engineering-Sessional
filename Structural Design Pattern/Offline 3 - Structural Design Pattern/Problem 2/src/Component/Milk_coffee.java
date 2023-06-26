package Component;

public class Milk_coffee extends Coffee {

    public int coffee_bean = 30;
    public int milk = 50;
    public int cup_cost = 100;

    public Milk_coffee() {
        description = "Milk coffee : Milk, Coffee beans";
    }

    public int cost() {
        int cost = coffee_bean + milk + cup_cost;
        return cost;
    }
}
