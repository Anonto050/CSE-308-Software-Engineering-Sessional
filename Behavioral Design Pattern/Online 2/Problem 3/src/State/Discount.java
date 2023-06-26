package State;

import Context.RentingSystem;

public class Discount implements State {
    @Override
    public void processRequest(RentingSystem context) {
        System.out.println("Discount state");
        context.setState(this);
    }
}
