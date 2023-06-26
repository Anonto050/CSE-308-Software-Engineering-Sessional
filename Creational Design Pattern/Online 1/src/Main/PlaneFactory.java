package Main;

public class PlaneFactory {
    Plane plane;

    public PlaneFactory(){}

    public Plane getPlane(String company){
        if(company.equalsIgnoreCase("Boeing"))
            plane = new Boeing();
        if(company.equalsIgnoreCase("Airbus"))
            plane = new Airbus();
        if(company.equalsIgnoreCase("Safran"))
            plane = new Safran();
        return plane;
    }
}
