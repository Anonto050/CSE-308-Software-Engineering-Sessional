package DriveSystem;

public class Rear_wheel implements DriveSystem{

    String Name;
    static String name = new String("Rear wheel");

    public Rear_wheel(){
        this.Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }
}
