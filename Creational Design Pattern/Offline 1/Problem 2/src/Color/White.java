package Color;

public class White implements Color{
    String Name;
    static String name = new String("White");

    public White(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
