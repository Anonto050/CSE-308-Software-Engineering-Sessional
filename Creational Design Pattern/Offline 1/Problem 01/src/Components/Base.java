package Components;

public class Base extends Components{
    public Base() {
        super("Base", 70000);
    }

    @Override
    public String getFeature() {
        return "Motherboard and 1 TB HDD";
    }
}
