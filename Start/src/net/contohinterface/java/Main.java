package net.contohinterface.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone redmiNote13 = new Xiaomi();

        PhoneUser ammar = new PhoneUser(redmiNote13);

        ammar.turnOnThePhone();

        try (Scanner input = new Scanner(System.in)) {
            String aksi;

            while (true) {
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Perkecil Volume");
                System.out.println("[0] Keluar");
                System.err.println("----------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    ammar.turnOnThePhone();
                } else if (aksi.equalsIgnoreCase("2")) {
                    ammar.turnOffThePhone();
                } else if (aksi.equalsIgnoreCase("3")) {
                    ammar.makePhoneLouder();
                } else if (aksi.equalsIgnoreCase("4")) {
                    ammar.makePhoneSilent();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.out.println("Anda keluar dari aplikasi");
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah");
                }
            }
        }
    }
}
