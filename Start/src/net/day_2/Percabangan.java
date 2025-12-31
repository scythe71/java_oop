package net.day_2;

import java.util.Scanner;
public class Percabangan {
    public static void main(String[] args) {
        int total;

        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Put your total here: ");
            total = input.nextInt();
        }

        if (total >= 100000) {
            System.out.println("Here for you (Diskon 10%)");
            double diskon = 10 * total / 100;
            total -= diskon;
        } else if (total >= 1000000) {
            System.out.println("Here for you (diskon 100%)");
            double diskon = 100 * total / 100;
            total -= diskon;
        }else {
            System.out.println("Your not getting diskon kid");
        }

        System.out.println("Your price is = RP." + total);
    }
}
