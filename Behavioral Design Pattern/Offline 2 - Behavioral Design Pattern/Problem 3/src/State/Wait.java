package State;
import Context.*;

import java.util.Scanner;

public class Wait implements State {
    private Scanner scanner = new Scanner(System.in);

    public void processRequest(VendingMachine vendingMachine) {
        System.out.println("Do you want to purchase another product? (y/n)");
        String answer = scanner.nextLine();
        if (answer.equals("y")) {
            System.out.println("Please insert money for another product");
            vendingMachine.insertMoney();
            vendingMachine.setState(new CollectMoney());
            vendingMachine.getState().processRequest(vendingMachine);
        } else {
            vendingMachine.setState(new Ends());
            vendingMachine.getState().processRequest(vendingMachine);
        }
    }
}
