package Color;

public class Black implements Color {
    String Name;
    static String name = new String("Black");

    public Black(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
