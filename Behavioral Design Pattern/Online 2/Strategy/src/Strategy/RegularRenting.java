package Strategy;

public class RegularRenting implements Strategy {

    private int price = 500;
    @Override
    public int calculateRent(int days) {
        int totprice = days * price;
        if(days > 30){
            totprice = (int) (totprice - (totprice * 0.1));
        }
        return totprice;
    }
}
