package Cars;

public class Car {
    public String CarType;
    public int NumberOfVisits;

    public Car(String carType, int numberOfVisits) {
        CarType = carType;
        NumberOfVisits = numberOfVisits;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }

    public int getNumberOfVisits() {
        return NumberOfVisits;
    }

    public void setNumberOfVisits(int numberOfVisits) {
        NumberOfVisits = numberOfVisits;
    }
}
