package Component;

public class Black_coffee extends Coffee {

    public int coffee_bean = 30;
    public int cup_cost = 100;

    public Black_coffee() {
        description = "Black coffee : Water, Coffee beans";
    }

    public int cost() {
        int cost = coffee_bean + cup_cost;
        return cost;
    }
}
