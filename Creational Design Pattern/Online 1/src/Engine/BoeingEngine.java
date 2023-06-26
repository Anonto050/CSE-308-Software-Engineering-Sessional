package Engine;

public class BoeingEngine implements Engines{
    String Name;
    static String name = new String("Boeing");

    public BoeingEngine(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
