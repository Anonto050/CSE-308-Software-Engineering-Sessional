package State;
import Context.*;

public class Returns implements State {
    @Override
    public void processRequest(VendingMachine vendingMachine) {
        int extra = vendingMachine.getMoney() - vendingMachine.getProductPrice();
        System.out.println("Returning extra money to the customer : " + extra);
        vendingMachine.setState(new Deliver());
        vendingMachine.getState().processRequest(vendingMachine);
    }
}

