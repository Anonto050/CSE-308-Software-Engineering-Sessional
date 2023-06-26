package State;

import Context.RentingSystem;

public class Repeating implements State {
    @Override
    public void processRequest(RentingSystem context) {
        System.out.println("Repeating state");
        context.setState(this);
    }
}
