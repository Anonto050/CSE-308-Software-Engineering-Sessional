package Wing;

import Main.Safran;

public class SafranWing implements Wing{
    String Name;
    static String name = new String("Safran");

    public SafranWing(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
