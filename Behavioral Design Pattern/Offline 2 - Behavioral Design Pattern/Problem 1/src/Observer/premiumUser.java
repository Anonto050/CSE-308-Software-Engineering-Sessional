package Observer;

import java.util.Scanner;

public class premiumUser implements IObserver {
    private int previousState;
    private int currentState;
    private boolean decision = false;
    private boolean copyData = false;
    private Scanner scanner = new Scanner(System.in);

    public premiumUser() {
        this.previousState = 0;
        this.currentState = 0;
    }

    @Override
    public void update(int state) {
        currentState = state;

        if(previousState == 0) {
            if(currentState == 1) {
                System.out.println("Premium User : ");
                System.out.println("Server is Partially Down");
                System.out.println("Do you want to use service from two servers (partially from the server of ABC and partially from the server of DEF) or from one server (DEF)?");
                System.out.println("Enter 1 to use service from two servers\nEnter 2 to use service from one server");
                int input = scanner.nextInt();
                if(input == 1) {
                    copyData = true;
                    decision = true;
                    System.out.println("You are using service from two servers");
                } else if(input == 2) {
                    copyData = true;
                    System.out.println("You are using only DEF server now. Your data is being copied to the server of DEF");
                }


            } else if(currentState == 2) {
                System.out.println("Premium User : ");
                System.out.println("Server is Fully Down");
                System.out.println("Service is now provided by the server of DEF");
                System.out.println("Your data is being copied to the server of DEF");
            }
        }
        else if(previousState == 1) {
            if(currentState == 0) {
                System.out.println("Premium User : ");
                System.out.println("Server is Operational");
            } else if(currentState == 2) {
                System.out.println("Premium User : ");
                System.out.println("Server is Fully Down");
                System.out.println("Service is now provided by the server of DEF");
                if(decision) {
                    System.out.println("Since you have used service from two servers, your data is now being copied to the server of DEF");
                }
            }
        }
        else if(previousState == 2) {
            if (currentState == 0) {
                System.out.println("Premium User : ");
                System.out.println("Server is Operational");
            } else if (currentState == 1) {
                System.out.println("Premium User : ");
                System.out.println("Server is Partially Down");
            }
        }

        previousState = currentState;
    }
}

