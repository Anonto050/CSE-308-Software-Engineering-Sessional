package State;

import Context.RentingSystem;

public class Regular implements State {
    @Override
    public void processRequest(RentingSystem context) {
        System.out.println("Regular state");
        context.setPrice(500);
        if(context.getCarType()=="luxury")
            context.setState(new Luxury());

        context.setState(this);

    }
}
