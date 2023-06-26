package Main;

import Engine.Engines;
import Engine.EnginesFactory;
import Wing.Wing;
import Wing.WingFactory;

public class Safran implements Plane{
    EnginesFactory enginesFactory = new EnginesFactory();
    Engines engines = enginesFactory.getEngines("Safran");

    WingFactory wingFactory = new WingFactory();
    Wing wing = wingFactory.getWing("Safran");


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
        System.out.println("Safran Details :");
        System.out.println("Engine : " + engines.getName());
        System.out.println("Wing : " + wing.getName());

    }
}
