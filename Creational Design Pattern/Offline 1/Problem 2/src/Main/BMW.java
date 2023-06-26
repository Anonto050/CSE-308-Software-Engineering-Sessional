package Main;

import Color.*;
import DriveSystem.*;
import Engines.*;
import manufacturer_country.*;

public class BMW implements Car{
    EnginesFactory enginesFactory = new EnginesFactory();
    Engines engines = enginesFactory.getEngines("Electric");

    ColorFactory colorFactory = new ColorFactory();
    Color color = colorFactory.getColor("Black");

    DriveSystemFactory driveSystemFactory = new DriveSystemFactory();
    DriveSystem driveSystem = driveSystemFactory.getDriveSystem("Rear wheel");

    manufacturer_countryFactory manufacturerCountryFactory = new manufacturer_countryFactory();
    manufacturer_country manufacturerCountry = manufacturerCountryFactory.getManufacturerCountry("Europe");


    @Override
    public Engines getEngine() {
        return engines;
    }

    @Override
    public DriveSystem getDriveSystem() {
        return driveSystem;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public manufacturer_country getCountry() {
        return manufacturerCountry;
    }

    @Override
    public void print() {
        System.out.println("BMW Details :");
        System.out.println("Engine : " + engines.getName());
        System.out.println("Drive Train System : " + driveSystem.getName());
        System.out.println("Continental location : " + manufacturerCountry.getName());
        System.out.println("Color : " + color.getName());
    }
}
