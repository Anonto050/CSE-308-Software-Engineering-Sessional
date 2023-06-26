package manufacturer_country;

public class manufacturer_countryFactory {
    manufacturer_country manufacturerCountry;

    public manufacturer_countryFactory(){}

    public manufacturer_country getManufacturerCountry(String opt){

        if(opt.equalsIgnoreCase("Asia"))
            manufacturerCountry = new Asia();
        else if(opt.equalsIgnoreCase("Europe"))
            manufacturerCountry = new Europe();
        else if(opt.equalsIgnoreCase("US"))
            manufacturerCountry = new US();
        return manufacturerCountry;
    }
}
