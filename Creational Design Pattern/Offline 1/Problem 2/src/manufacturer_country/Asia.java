package manufacturer_country;

public class Asia implements manufacturer_country{
    String Name;
    static String name = new String("Asia");

    public Asia(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
