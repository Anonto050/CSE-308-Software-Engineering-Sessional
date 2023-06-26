package State;
import Context.*;

public class Ends implements State {
    public void processRequest(VendingMachine vendingMachine) {
        System.out.println("No more product left. Thank you for using our vending machine. ");
    }
}
