package net.pet_rent;

import net.pet_rent.Pet.Reaction;

public class PetRentShop {
    private Pet currentPet;

    public enum Action {
        INFO, PLAY, EAT, PET, ANNOY
    }

    public void start(Pet pet) {
        currentPet = pet;
        System.out.printf("Sewa dengan %s dimulai.%n", pet.getName());
    }

    public void interact(Action action) {
        header(action.name());

        switch (action) {
            case INFO -> currentPet.petInfo();
            case PLAY -> currentPet.play();
            case EAT -> currentPet.eat();
            case PET -> currentPet.pet();
            case ANNOY -> {
                Reaction react = currentPet.annoy();
                handle(react);
            }
        }

        System.out.println("=================================");
    }

    public void handle(Reaction react) {
        if (react == Reaction.AGGRESSIVE) {
            System.out.printf("%n%s dikembalikan ke shop.%n", currentPet.getName());
            currentPet = null;
            System.out.println("Sewa berakhir.");
        }
        else if (react == Reaction.ANNOYED) {
            System.out.printf("%nMaaf Tuan, sepertinya %s tidak nyaman dengan itu.%n", currentPet.getName());
        }
    }

    public void end() {
        if (isActive()) {
            System.out.printf("Sewa dengan %s berakhir.%n", currentPet.getName());
            currentPet = null;
        }
    }

    public boolean isActive() {
        return currentPet != null;
    }

    private void header(String title) {
        System.out.println();
        System.out.println("\n\u001B[36m========== " + title + " ==========\u001B[0m");
    }

}
