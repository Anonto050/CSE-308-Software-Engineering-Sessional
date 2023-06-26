package Engine;

public class AirbusEngine implements Engines{
    String Name;
    static String name = new String("Airbus");

    public AirbusEngine(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
