package Context;
import State.*;

import java.util.Scanner;

public class VendingMachine {
    private State state;
    private int money;
    private int productCount;
    private int productPrice;

    public VendingMachine(int money,int productCount, int productPrice) {
        this.money = money;
        this.productCount = productCount;
        this.productPrice = productPrice;

        state = new CollectMoney();
        state.processRequest(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getMoney() {
        return money;
    }

    public int getProductCount() {
        return productCount;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void insertMoney() {
        System.out.println("Price: " + productPrice);
        System.out.println("Product count: " + productCount);

        Scanner scanner = new Scanner(System.in);
        Integer money = scanner.nextInt();

        this.money += money;
    }


    public void processRequest() {
        state.processRequest(this);
    }
}
