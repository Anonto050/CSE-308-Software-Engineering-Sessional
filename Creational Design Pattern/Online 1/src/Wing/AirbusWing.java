package Wing;

public class AirbusWing implements Wing{
    String Name;
    static String name = new String("Airbus");

    public AirbusWing(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
