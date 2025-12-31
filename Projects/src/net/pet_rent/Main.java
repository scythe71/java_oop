package net.pet_rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetRentShop shop = new PetRentShop();
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("========== PET RENT ==========");
            System.out.println("Selamat datang di Pet Rental!");
            System.out.println("Silahkan pilih jenis pet yang ingin anda rental!.");
            System.out.println("1. Kucing");
            System.out.println("2. Anjing");
            System.out.println("3. Keluar");
            System.out.print("pilihan -> ");
            String pilihPet = input.nextLine();

            switch (pilihPet) {
                case "1" -> {
                    Pet neko = new Cat("neko-san");
                    shop.start(neko);
                    // neko.petInfo();
                    break;
                } case "2" -> {
                    Pet inu = new Dog("inu-kun");
                    shop.start(inu);
                    // inu.petInfo();
                    break;
                } case "3" -> {
                    System.out.println("Terima kasih telah berkunjung!");
                    return;
                } default -> {
                    System.out.println("pilihan tidak tersedia!");
                    break;
                }
            }

            // System.out.printf("%n========== PET MENU ==========%n");
            // System.out.println("Silahkan pilih menu yang ingin anda lakukan!.");
            // System.out.println("1. Info Pet");
            // System.out.println("2. Interract bersama pet");
            // System.out.println("3. Berhenti rental");
            // System.out.print("pilihan -> ");

            while (shop.isActive()) {
                System.out.printf("%n========== PET MENU ==========%n");
                System.out.println("Silahkan pilih menu yang ingin anda lakukan!.");
                System.out.println("1. Info Pet");
                System.out.println("2. Interract bersama pet");
                System.out.println("3. Berhenti rental");
                System.out.print("pilihan -> ");
                String pilihMenu = input.nextLine();

                switch (pilihMenu) {
                    case "1" -> {
                        shop.interact(PetRentShop.Action.INFO);
                        break;
                    } case "2" -> {
                        boolean interract = true;
                        while (interract && shop.isActive()) {
                            System.out.printf("%n========== PET INTERRACT ==========%n");
                            System.out.println("Silahkan pilih menu yang ingin anda lakukan!.");
                            System.out.println("1. Bermain");
                            System.out.println("2. Beri Makan");
                            System.out.println("3. Pet");
                            System.out.println("4. Annoy (not recommended)");
                            System.out.println("5. Keluar Interract");
                            System.out.print("pilihan -> ");

                            String pilihInteract = input.nextLine();

                            switch (pilihInteract) {
                                case "1" -> {
                                    shop.interact(PetRentShop.Action.PLAY);
                                    break;
                                } case "2" -> {
                                    shop.interact(PetRentShop.Action.EAT);
                                    break;
                                } case "3" -> {
                                    shop.interact(PetRentShop.Action.PET);
                                    break;
                                } case "4" -> {
                                    shop.interact(PetRentShop.Action.ANNOY);
                                    break;
                                } case "5" -> {
                                    interract = false;
                                    break;
                                } default -> {
                                    System.out.println("pilihan tidak tersedia!");
                                    break;
                                }
                            }
                        }
                        break;
                    } case "3" -> {
                        shop.end();
                        break;
                    } default -> {
                        System.out.println("pilihan tidak tersedia!");
                        break;
                    }
                }
            }
        }
        
    }
}
