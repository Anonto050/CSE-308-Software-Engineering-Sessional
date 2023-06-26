package Main;

import Engine.Engines;
import Engine.EnginesFactory;
import Wing.Wing;
import Wing.WingFactory;

public class Airbus implements Plane{
    EnginesFactory enginesFactory = new EnginesFactory();
    Engines engines = enginesFactory.getEngines("Airbus");

    WingFactory wingFactory = new WingFactory();
    Wing wing = wingFactory.getWing("Airbus");


    @Override
    public Engines getEngine() {
        return engines;
    }

    @Override
    public Wing getWing() {
        return wing;
    }

    @Override
    public void print() {
        System.out.println("Airbus Details :");
        System.out.println("Engine : " + engines.getName());
        System.out.println("Wing : " + wing.getName());

    }
}
