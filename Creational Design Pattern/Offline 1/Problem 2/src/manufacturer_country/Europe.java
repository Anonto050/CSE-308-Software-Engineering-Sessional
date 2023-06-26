package manufacturer_country;

public class Europe implements manufacturer_country{
    String Name;
    static String name = new String("Europe");

    public Europe(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
