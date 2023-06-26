package Wing;

import Engine.AirbusEngine;
import Engine.BoeingEngine;
import Engine.Engines;
import Engine.SafranEngine;

public class WingFactory {
    Wing wing;

    public WingFactory(){}

    public Wing getWing(String opt){

        if(opt.equalsIgnoreCase("Boeing"))
            wing = new BoeingWing();
        else if(opt.equalsIgnoreCase("Airbus"))
            wing = new AirbusWing();
        else if(opt.equalsIgnoreCase("Safran"))
            wing = new SafranWing();
        return wing;

    }
}
