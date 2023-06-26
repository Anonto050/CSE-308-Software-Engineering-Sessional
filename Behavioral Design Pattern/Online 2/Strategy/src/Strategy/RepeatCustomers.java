package Strategy;

public class RepeatCustomers implements Strategy {
    @Override
    public void calculateRent(int days) {
        return days * 50;
    }
}
}
