package DriveSystem;

public class All_wheel implements DriveSystem{
    String Name;
    static String name = new String("All wheel");

    public All_wheel(){
        this.Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }
}
