package net.day_3;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int awal, akhir;

        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nilai awal: ");
            awal = input.nextInt();
            System.out.print("Masukkan nilai akhir: ");
            akhir = input.nextInt();
        }

        int b = awal;
        while (b <= akhir) {
            System.out.print(b + " ");
        b++;
        }

        System.out.println(" ");

        int a = akhir;
        while (a >= awal) {
            System.out.print(a + " ");
        a--;
        }
    }
}
