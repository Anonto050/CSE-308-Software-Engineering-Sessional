package Main;

import Context.*;

import java.util.Random;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String carType = scanner.nextLine();
          RentingSystem rentingSystem = new RentingSystem();
            rentingSystem.setCarType(carType);

            while(true) {
                int t = scanner.nextInt();
                if(t==0)
                    break;
                rentingSystem.processRequest();
            }

    }
}

