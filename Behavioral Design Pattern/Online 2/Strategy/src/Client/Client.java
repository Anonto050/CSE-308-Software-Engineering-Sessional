package Client;

import Context.Context;
import Strategy.*;

public class Client {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));
    }
}
