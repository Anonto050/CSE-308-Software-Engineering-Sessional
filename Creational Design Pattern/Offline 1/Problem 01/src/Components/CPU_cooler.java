package Components;

public class CPU_cooler extends Components{

    public CPU_cooler() {
        super("CPU Cooler", 36000);
    }

    @Override
    public String getFeature() {
        return "CPU Cooler";
    }
}
