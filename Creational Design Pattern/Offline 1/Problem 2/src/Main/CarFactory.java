package Main;

public class CarFactory {
    Car cars;

    public CarFactory(){}

    public Car getCars(String country){
        if(country.equalsIgnoreCase("Asia"))
            cars = new Toyota();
        if(country.equalsIgnoreCase("US"))
            cars = new Tesla();
        if(country.equalsIgnoreCase("Europe"))
            cars = new BMW();
        return cars;
    }
}
