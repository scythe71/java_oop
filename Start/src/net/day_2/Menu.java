package net.day_2;

import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        int bakso = 8000;
        int mie_ayam = 9000;
        int rujak = 5000;
        int pilih, jumlah, total;


        System.out.println("---- MENU MAKANAN ----");
        System.out.println("1. Bakso");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Rujak");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Silahkan Pilih Menu: ");
            pilih = input.nextInt();
            System.out.print("Jumlah Porsi: ");
            jumlah = input.nextInt();
        }
        

        System.out.println("================");
        // if (pilih == 1) {
        //     System.out.println("Bakso Rp.8000/porsi");
        //     total = bakso * jumlah;
        //     System.out.println("Total bayar : Rp." + total);
        // } else if (pilih == 2) {
        //     System.out.println("Mie Ayam Rp.9000/porsi");
        //     total = mie_ayam * jumlah;
        //     System.out.println("Total bayar : Rp." + total);
        // } else if (pilih == 3) {
        //     System.out.println("Rujak Rp.5000/porsi");
        //     total = rujak * jumlah;
        //     System.out.println("Total bayar : Rp." + total);
        // }

        switch(pilih) {
            case 1 ->{
                System.out.println("Menu dipesan: ");
                System.out.println("Bakso Rp.8000/porsi");
                total = bakso * jumlah;
                System.out.println("Total bayar : Rp." + total);
            }

            case 2 -> {
                System.out.println("Menu dipesan: ");
                System.out.println("Mie Ayam Rp.9000/porsi");
                total = mie_ayam * jumlah;
                System.out.println("Total bayar : Rp." + total);
            }
            
            case 3 -> {
                System.out.println("Menu dipesan: ");
                System.out.println("Rujak Rp.5000/porsi");
                total = rujak * jumlah;
                System.out.println("Total bayar : Rp." + total);
            }
            
            default -> System.out.println("Menu tidak tersedia");
        }
    }
}
