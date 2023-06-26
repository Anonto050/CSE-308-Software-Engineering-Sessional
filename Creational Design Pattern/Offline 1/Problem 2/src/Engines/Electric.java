package Engines;

public class Electric implements Engines {
    String Name;
    static String name = new String("Electric");

    public Electric(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
