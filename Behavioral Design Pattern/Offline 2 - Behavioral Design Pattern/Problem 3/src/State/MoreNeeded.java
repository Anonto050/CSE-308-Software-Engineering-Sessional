package State;
import Context.*;

public class MoreNeeded implements State {
    public void processRequest(VendingMachine vendingMachine) {
        int need = vendingMachine.getProductPrice() - vendingMachine.getMoney();
        System.out.println("Please insert more " + need + " money");
        vendingMachine.insertMoney();
        if(vendingMachine.getMoney() == vendingMachine.getProductPrice()) {
            vendingMachine.setState(new Deliver());
            vendingMachine.getState().processRequest(vendingMachine);
        } else if(vendingMachine.getMoney() > vendingMachine.getProductPrice()){
            vendingMachine.setState(new Returns());
            vendingMachine.getState().processRequest(vendingMachine);
        }
        else {
            vendingMachine.setState(new MoreNeeded());
            vendingMachine.getState().processRequest(vendingMachine);
        }
    }
}
