package Component;

public abstract class Coffee {
    public String description = "Coffee";
    //public int cost = 100; //cup cost
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int cost();
}
