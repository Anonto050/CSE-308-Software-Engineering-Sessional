package Engine;

public class EnginesFactory {
    Engines engines;

    public EnginesFactory(){}

    public Engines getEngines(String opt){

        if(opt.equalsIgnoreCase("Boeing"))
            engines = new BoeingEngine();
        else if(opt.equalsIgnoreCase("Airbus"))
            engines = new AirbusEngine();
        else if(opt.equalsIgnoreCase("Safran"))
            engines = new SafranEngine();
        return engines;

    }
}
