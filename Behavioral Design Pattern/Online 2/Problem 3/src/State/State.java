package State;

import Context.RentingSystem;

public interface State {
    void processRequest(RentingSystem context);
}
