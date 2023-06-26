package Main;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter company name : ");
        Scanner scanner = new Scanner(System.in);
        String company = scanner.nextLine();

        PlaneFactory planeFactory = new PlaneFactory();

        Plane plane = planeFactory.getPlane(company);
        plane.print();
    }
}