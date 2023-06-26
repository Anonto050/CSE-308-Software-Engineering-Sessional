package State;
import Context.*;

public class Deliver implements State {
    public void processRequest(VendingMachine vendingMachine) {
        System.out.println("Delivering the product");
        vendingMachine.setProductCount(vendingMachine.getProductCount() - 1);
        vendingMachine.setMoney(0);
        if (vendingMachine.getProductCount() == 0) {
            vendingMachine.setState(new Ends());
            vendingMachine.getState().processRequest(vendingMachine);
        } else {
            vendingMachine.setState(new Wait());
            vendingMachine.getState().processRequest(vendingMachine);
        }
    }
}
