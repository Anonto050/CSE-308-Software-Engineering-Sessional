package Main;

import Observer.*;
import Subject.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Server server = new Server();
        premiumUser pUser = new premiumUser();
        regularUser rUser = new regularUser();

        server.register(pUser);
        server.register(rUser);
        server.setState(0);
        server.notifyObservers();

        while (true) {
            System.out.println("Enter 1 to change state to Partially Down\nEnter 2 to change state to Fully Down\nEnter 0 to change state to Operational\nEnter -1 to exit");
            System.out.println("Enter a number to change the state of the server: ");

            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            server.setState(input);
            server.notifyObservers();
        }

    }
}
