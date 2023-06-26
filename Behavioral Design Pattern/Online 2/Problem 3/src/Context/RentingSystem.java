package Context;

import State.State;

public class RentingSystem {
    public State state;
    public String CarType;
    public int price;
    public int days;

    public RentingSystem() {
        state = null;
        CarType = "";
        price = 0;
        days = 1;
    }

    public RentingSystem(State state, String CarType, int price, int days) {
        this.state = state;
        this.CarType = CarType;
        this.price = price;
        this.days = days;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCarType(String CarType) {
        this.CarType = CarType;
    }

    public String getCarType() {
        return CarType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void processRequest() {
        state.processRequest(this);
    }

}
