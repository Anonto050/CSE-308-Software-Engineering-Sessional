package Main;
import Engine.*;
import Wing.*;


public class Boeing implements Plane{
    EnginesFactory enginesFactory = new EnginesFactory();
    Engines engines = enginesFactory.getEngines("Boeing");

    WingFactory wingFactory = new WingFactory();
    Wing wing = wingFactory.getWing("Boeing");


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
        System.out.println("Boeing Details :");
        System.out.println("Engine : " + engines.getName());
        System.out.println("Wing : " + wing.getName());

    }
}
