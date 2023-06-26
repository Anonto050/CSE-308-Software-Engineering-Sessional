package Engines;

public class HFC implements Engines{

    String Name;
    static String name = new String("Hydrogen Fuel Cells");

    public HFC(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
