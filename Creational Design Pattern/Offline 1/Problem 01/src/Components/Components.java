package Components;

public abstract class Components {
    private String component_name;
    private int base_price;

    public Components(String component_name, int base_price){
        this.component_name = component_name;
        this.base_price = base_price;
    }

    public String getComponent_name() {
        return component_name;
    }

    public int getBase_price() {
        return base_price;
    }

    public abstract String getFeature();

}
