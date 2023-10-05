import OOP.PRINCIPLES.interfaces.Car;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        float amountOfMoney = Float.parseFloat(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        float priceLightSaber = Float.parseFloat(sc.nextLine());
        float priceRobes = Float.parseFloat(sc.nextLine());
        float priceBelts = Float.parseFloat(sc.nextLine());

        float priceLightSaberALL = students * priceBelts + (students + ((10 / 100) * students));
        float priceRobesALL = students * priceRobes;
        float priceBeltsALL = 0;

            for (int i = 0; i < students; i++) {
                if (i % 6 == 0) {
                    priceBelts = 0;
                }
                priceBeltsALL += priceBelts;
            }

        float moneyNeeded = priceBeltsALL + priceRobesALL + priceLightSaberALL;

        if (moneyNeeded == amountOfMoney || moneyNeeded < amountOfMoney) {
            System.out.println(moneyNeeded);
        } else {
            System.out.printf("shte trqbvat : %d", moneyNeeded - amountOfMoney);
        }

        System.out.println("gosho");
    }


}
