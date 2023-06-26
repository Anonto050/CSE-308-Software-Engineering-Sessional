package Color;

import manufacturer_country.manufacturer_country;

public class ColorFactory {

    public Color color;
    public ColorFactory(){}

    public Color getColor(String opt){

        if(opt.equalsIgnoreCase("Red"))
            color = new Red();
        else if(opt.equalsIgnoreCase("Black"))
            color = new Black();
        else if(opt.equalsIgnoreCase("White"))
            color = new White();
        return color;
    }
}
