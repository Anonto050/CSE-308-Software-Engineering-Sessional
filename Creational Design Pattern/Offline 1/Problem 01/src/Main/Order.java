package Main;

import Components.Components;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Components> componentsList;

    public Order(){
        componentsList = new ArrayList<>();
    }

    public void Add(Components components){
        componentsList.add(components);
    }

    public int getCost(){
        int cost = 0;
        for (Components components : componentsList) {
             cost = cost + components.getBase_price();
        }

        return cost;
    }

    public void Show(){

        for (Components components : componentsList) {
            System.out.println(components.getFeature());
        }
        System.out.println("Total cost of PC : " + getCost());
    }
}
