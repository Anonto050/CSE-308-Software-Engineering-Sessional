package Components;

public class DVD_drive extends Components{
    public DVD_drive() {
        super("DVD Drive", 6000);
    }

    @Override
    public String getFeature() {
        return "DVD Drive";
    }
}
