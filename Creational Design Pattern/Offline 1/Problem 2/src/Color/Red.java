package Color;

public class Red implements Color{
    String Name;
    static String name = new String("Red");

    public Red(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
