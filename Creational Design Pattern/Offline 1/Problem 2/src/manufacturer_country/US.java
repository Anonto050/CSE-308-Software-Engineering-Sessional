package manufacturer_country;

public class US implements manufacturer_country{
    String Name;
    static String name = new String("US");

    public US(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
