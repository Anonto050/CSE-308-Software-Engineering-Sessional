package Engine;

import Main.Safran;

public class SafranEngine implements Engines{
    String Name;
    static String name = new String("Safran");

    public SafranEngine(){
        this.Name = name;
    }
    @Override
    public String getName() {
        return Name;
    }
}
