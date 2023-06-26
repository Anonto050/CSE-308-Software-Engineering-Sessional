package State;

import Context.RentingSystem;

public class Luxury implements State {
    public void processRequest(RentingSystem context) {
        System.out.println("Luxury car is being rented");
        context.setState(this);
    }
}
