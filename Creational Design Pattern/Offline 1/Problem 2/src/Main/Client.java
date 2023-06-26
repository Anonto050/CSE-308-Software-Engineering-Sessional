package Main;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter continental location : ");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        CarFactory carFactory = new CarFactory();

        Car car = carFactory.getCars(country);
        car.print();
    }
}
