package Subject;

import Observer.*;

import java.util.List;
import java.util.ArrayList;

public class Server implements ISubject {
    private List<IObserver> observers;
    private int state;

    public Server() {
        this.observers = new ArrayList<>();
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    @Override
    public void register(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : this.observers) {
            o.update(state);
        }
    }
}
