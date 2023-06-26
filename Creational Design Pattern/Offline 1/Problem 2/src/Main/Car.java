package Main;

import Color.Color;
import DriveSystem.DriveSystem;
import Engines.Engines;
import manufacturer_country.manufacturer_country;

public interface Car {
    Engines getEngine();
    DriveSystem getDriveSystem();
    Color getColor();
    manufacturer_country getCountry();
    void print();
}
