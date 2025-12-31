package net.pet_rent;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
        changeEnergy(+30);
        changeMood(Mood.HAPPY);
    }

    @Override
    public void play() {
        if (isTired()) {
            changeMood(Mood.MAD);
            changeEnergy(-10);

            System.out.println("Augh... (Sangat lelah)");
            System.out.printf("%s Tampak berlari kecapean (I think he need some food or rest).%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
        else if (isMad()) {
            changeEnergy(-40);
            changeMood(Mood.FLAT);

            System.out.println("Wuf! (Ekor goyang dikit)");
            System.out.printf("%s awalnya ngambek, lanjut main kejar bola.%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
        else {
            changeEnergy(-20);
            changeMood(Mood.HAPPY);

            System.out.println("WUF WUF WUF! (Lari keliling lapangan)");
            System.out.printf("%s sangat bahagia bermain lempar bola!.%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
    }

    @Override
    public void eat() {
        if (isFull()) {
            // >= <=
            System.out.println("Auuu~ (Perut kekenyangan)");
            System.out.printf("%s cuma mengendus makanannya saja.%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
        else {
            changeEnergy(+40);
            changeMood(Mood.HAPPY);

            System.out.println("Slurp! (Makan dengan brutal)");
            System.out.printf("%s melahap habis semua makanannya dalam sekejap!%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
    }

    @Override
    public Reaction annoy() {
        if (getMood() == Mood.MAD) {
            System.out.println("Aww... (Tersakiti)");
            System.out.printf("%s terlihat SANGAT tidak menyukainya (enough!!).%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
            return Reaction.ANNOYED;
        }
        else {
            if (getMood() == Mood.FLAT) changeMood(Mood.MAD);
            else changeMood(Mood.FLAT);

            System.out.println("Whine... (Sedih)");
            System.out.printf("%s tidak menyukainya (what are yah doin!).%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
            return Reaction.OK;
        }
    }

    @Override
    public void pet() {
        changeEnergy(+20);
        changeMood(Mood.HAPPY);

        System.out.println("Wuf wuf! (berputar-putar)");
        System.out.printf("%s sangat menyukainya.%n", getName());
        System.out.printf("Energy: %d%%%n", getEnergy());
        System.out.printf("Mood: %s%n", getMood());
    }
}
