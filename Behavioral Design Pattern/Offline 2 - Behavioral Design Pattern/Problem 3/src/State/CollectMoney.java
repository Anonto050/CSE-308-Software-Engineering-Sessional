package State;
import Context.*;

public class CollectMoney implements State {
    public void processRequest(VendingMachine vendingMachine) {
        System.out.println("Collecting money...");
        if(vendingMachine.getProductCount()==0){
            vendingMachine.setState(new Ends());
            vendingMachine.getState().processRequest(vendingMachine);
        }
        else if(vendingMachine.getMoney() == vendingMachine.getProductPrice()) {
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
