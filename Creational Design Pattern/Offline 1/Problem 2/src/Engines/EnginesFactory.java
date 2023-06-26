package Engines;

public class EnginesFactory {
    Engines engines;

    public EnginesFactory(){}

    public Engines getEngines(String opt){

        if(opt.equalsIgnoreCase("Electric"))
            engines = new Electric();
        else if(opt.equalsIgnoreCase("Hydrogen Fuel Cells"))
            engines = new HFC();
        return engines;

    }
}
