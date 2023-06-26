package Main;

import Builder.*;
import Components.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Order> orderList = new ArrayList<>();

    public static void constructPC(){
        Director director = null;
        PCBuilder pcBuilder = null;
        Components cmp = null;
        String pc = null;
        String ans = null;

        System.out.print("\n" + "Choose among (type1/ type2/ type3/ gaming) PCs: ");
        pc = scanner.nextLine();


        if(pc.equalsIgnoreCase("type1")) {
            pcBuilder = new Type1_Builder();
        } else if(pc.equalsIgnoreCase("type2")) {
            pcBuilder = new Type2_Builder();
        } else if(pc.equalsIgnoreCase("type3")) {
            pcBuilder = new Type3_Builder();
        } else if(pc.equalsIgnoreCase("gaming")) {
            pcBuilder = new GamingPCBuilder();
        }

        director = new Director(pcBuilder);

        System.out.println("Choose RAM? [y/n]");
        ans = scanner.nextLine();
        if(ans.equalsIgnoreCase("y"))
        {
            System.out.println("Choose 8 GB DDR4 RAM among : 2666/3200 MHz");
            ans = scanner.nextLine();
            if(ans.equalsIgnoreCase("2666")) {
                cmp = new DDR4_2666();
                director.AddOns(cmp);
            }
            else {
                cmp = new DDR4_3200();
                director.AddOns(cmp);
            }
        }


        System.out.println("Choose Graphics Card? [y/n]");
        ans = scanner.nextLine();
        if(ans.equalsIgnoreCase("y"))
        {
            System.out.println("Choose among : 2/4 GB");
            ans = scanner.nextLine();
            if(ans.equalsIgnoreCase("2")) {
                cmp = new GraphicsCard_2GB();
                director.AddOns(cmp);
            }
            else {
                cmp = new GraphicsCard_4GB();
                director.AddOns(cmp);
            }
        }

        orderList.add(director.getOrder());

        return ;
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("Press 'O' to open an order");
            System.out.println("Press 'E' to close order");
            System.out.print("Now Press: ");

            String press = scanner.nextLine();

            if(press.equalsIgnoreCase("O"))
                constructPC();
            else if(press.equalsIgnoreCase("E")) {
                if (orderList.size() == 0) {
                    System.out.println("\n" + "At least 1 order must be made" + "\n");
                    continue;
                }
            }

            System.out.println("Do want to continue to order? [y/n]");
            String ans = scanner.nextLine();

            if(ans.equalsIgnoreCase("n"))
                break;
            else {
                continue;
            }
        }

        int cost = 0;
        for (Order order:orderList) {
            cost += order.getCost();
            order.Show();
        }

        System.out.println("\n" + "Total cost : " + cost + " taka");
    }
}

