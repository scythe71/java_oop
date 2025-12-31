package net.day_3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int pil;

        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan pil: ");
            pil = input.nextInt();
        }

        switch (pil) {
            case 1 -> {
                System.out.println("Pil ditemukan.");
            }

            case 2 -> {
                System.out.println("Pil tidak ditemukan.");
            }

            default -> System.out.println("pil tidak ditemukan."); 
        }
    }
}