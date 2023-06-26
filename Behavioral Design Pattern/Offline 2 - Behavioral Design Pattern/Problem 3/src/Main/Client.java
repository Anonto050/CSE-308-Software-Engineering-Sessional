package Main;

import Context.*;

import java.util.Random;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int price = rand.nextInt(100);
        int count = rand.nextInt(10);
        System.out.println("Price: " + price );
        System.out.println("Product count: " + count);

        System.out.println("Enter money: ");
          Integer money = scanner.nextInt();

          VendingMachine vendingMachine = new VendingMachine(money, count, price);

    }
}

