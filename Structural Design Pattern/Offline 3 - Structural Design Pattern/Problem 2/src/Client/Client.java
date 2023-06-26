package Client;

import Component.Black_coffee;
import Component.Coffee;
import Component.Milk_coffee;
import Deccorator.Chocolate_sauce;
import Deccorator.Cinnamon_powder;
import Deccorator.Coffee_beans;
import Deccorator.Dairy_cream;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int cup;

        System.out.println("Choose your coffee:");
        System.out.println("1. Americano\n2. Espresso\n3. Cappuccino\n4. Mocha");
        choice = scanner.nextInt();
        System.out.println("How many cups?");
        cup = scanner.nextInt();

        if(choice == 1){
            Coffee coffee = new Black_coffee();
            coffee = new Coffee_beans(coffee);
            System.out.println("Americano : ");
            System.out.println("Ingredients : " + coffee.getDescription());
             System.out.println("Individual cost : " + coffee.cost());
            System.out.println("Total cost : " + coffee.cost() * cup);
        }
        else if(choice == 2){
            Coffee coffee = new Black_coffee();
            coffee = new Dairy_cream(coffee);
            System.out.println("Espresso : ");
            System.out.println("Ingredients : " + coffee.getDescription());
            System.out.println("Individual cost : " + coffee.cost());
            System.out.println("Total cost : " + coffee.cost() * cup);
        }
        else if(choice == 3){
            Coffee coffee = new Milk_coffee();
            coffee = new Cinnamon_powder(coffee);
            System.out.println("Cappuccino : ");
            System.out.println("Ingredients : " + coffee.getDescription());
            System.out.println("Individual cost : " + coffee.cost());
            System.out.println("Total cost : " + coffee.cost() * cup);
        }
        else if(choice == 4){
            Coffee coffee = new Milk_coffee();
            coffee = new Chocolate_sauce(coffee);
            System.out.println("Mocha : ");
            System.out.println("Ingredients : " + coffee.getDescription());
            System.out.println("Individual cost : " + coffee.cost());
            System.out.println("Total cost : " + coffee.cost() * cup);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
