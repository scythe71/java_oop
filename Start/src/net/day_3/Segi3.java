package net.day_3;

import java.util.Scanner;

public class Segi3 {
    public static void main(String[] args) {
        
        // for(int i = 0; i < 10; i++) {
        //     for(int j = 10; j > 0; j--) {
        //         System.out.println("*");
        //     }
        // }

        int jml;

        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Angka: ");
            jml = input.nextInt();
        }

        for (int i = 1; i <= jml; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }
}
