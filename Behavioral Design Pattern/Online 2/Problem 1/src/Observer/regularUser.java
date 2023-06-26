package Observer;

import java.util.Scanner;

public class regularUser implements IObserver {
    private int previousState;
    private int currentState;
    private Scanner scanner = new Scanner(System.in);
    private int payment;
    private boolean copyData = false;

    public regularUser() {
        this.previousState = 0;
        this.currentState = 0;
    }
    @Override
    public void update(int state) {
        currentState = state;

        if(previousState == 0) {
            if(currentState == 1) {
                System.out.println("Regular User : ");
                System.out.println("Server is Partially Down");
                System.out.println("Do you want to continue using the limited functionality or pay $20 per hour to enjoy the full functionality taking service from server of DEF?");

                System.out.println("Enter 1 to continue using the limited functionality\nEnter 2 to pay $20 per hour to enjoy the full functionality");
                int input = scanner.nextInt();
                if(input == 1) {
                    System.out.println("You are using the limited functionality");
                } else if(input == 2) {
                    copyData = true;
                    System.out.println("Your data is being copied to the server of DEF");
                }

            } else if(currentState == 2) {
                System.out.println("Regular User : ");
                System.out.println("Server is Fully Down");
                System.out.println("Do you want to pay $20 per hour to enjoy the full functionality taking service from server of DEF?");

                System.out.println("Enter 1 to pay $20 per hour to enjoy the full functionality\nEnter 2 to exit");
                int input = scanner.nextInt();
                if(input == 1) {
                    copyData = true;
                    System.out.println("Your data is being copied to the server of DEF");
                } else if(input == 2) {
                    System.out.println("You are exiting");
                }
            }
        }
        else if(previousState == 1) {
            if(currentState == 0) {
                System.out.println("Regular User : ");
                System.out.println("Server is Operational");
                if(copyData) {
                    System.out.println("You have paid $20 per hour to enjoy the full functionality taking service from server of DEF for 10 hours");
                    payment = 20 * 10;
                    System.out.println("Your payment is $" + payment);
                }
            } else if(currentState == 2) {
                 System.out.println("Regular User : ");
                 System.out.println("Server is Fully Down");

            }
        }
        else if(previousState == 2) {
            if (currentState == 0) {
                System.out.println("Regular User : ");
                System.out.println("Server is Operational");
                if(copyData) {
                    System.out.println("You have paid $20 per hour to enjoy the full functionality taking service from server of DEF for 10 hours");
                    payment = 20 * 10;
                    System.out.println("Your payment is $" + payment);
                }

            } else if (currentState == 1) {
                System.out.println("Regular User : ");
                System.out.println("Server is Partially Down");
            }
        }

        previousState = currentState;
    }
}

