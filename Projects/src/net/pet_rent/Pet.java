package net.pet_rent;

public abstract class Pet {
    protected enum Mood {
        HAPPY, FLAT, MAD
    }
    public enum Reaction {
        OK,
        ANNOYED,
        AGGRESSIVE
    }

    private Mood mood;
    private int energy;

    private final String name;
    private final int MIN_ENERGY = 0;
    private final int MAX_ENERGY = 100;

    protected Pet(String name) {
        this.name = name;
        energy = 50;
        mood = Mood.FLAT;
    }

    public void petInfo() {
        System.out.printf("Nama   : %s%n", getName());
        System.out.printf("Energy : %d%%%n", getEnergy());
        System.out.printf("Mood   : %s%n", getMood());
    }

    protected String getName() {
        return name;
    }

    protected final void changeMood(Mood mood) {
        this.mood = mood;
    }

    protected boolean isHappy() {
        return mood == Mood.HAPPY;
    }

    protected boolean isMad() {
        return mood == Mood.MAD;
    }

    protected boolean isTired() {
        return energy < 30;
    }

    protected boolean isFull() {
        return energy >= MAX_ENERGY;
    }

    protected Mood getMood() {
        return mood;
    }

    protected final void changeEnergy(int delta) {
        energy += delta;
        energy = Math.max(MIN_ENERGY, Math.min(MAX_ENERGY, energy));
    }

    protected int getEnergy() {
        return energy;
    }

    public abstract void play();
    public abstract void eat();
    public abstract void pet();
    public abstract Reaction annoy();
}
