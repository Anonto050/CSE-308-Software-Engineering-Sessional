package Wing;

public class BoeingWing implements Wing{
    String Name;
    static String name = new String("Boeing");

    public BoeingWing(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
