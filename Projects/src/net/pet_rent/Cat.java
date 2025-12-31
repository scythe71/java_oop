package net.pet_rent;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        if (isTired()) {
            System.out.println("Mee... (suara pelan)");
            System.out.printf("Sepertinya %s sedang lelah (give %s some food or pet it).%n", getName(), getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
        else if (isMad()) {
            System.out.println("Meeeeeow...! (muka masam, pura-pura gak lihat kamu)");
            System.out.printf("Sepertinya %s sedang ngambek (what have you done brah).%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
        else {
            if (getMood() == Mood.HAPPY) {
                changeEnergy(-30);

                System.out.println("Meonggrrr~ (Bersemangat)");
                System.out.printf("%s sedang berusaha menangkap laser.%n", getName());
                System.out.printf("Energy: %d%%%n", getEnergy());
                System.out.printf("Mood: %s%n", getMood());
            }
            else { //else ini pasti Mood.FLAT karena happy dan mad udah dicek diatas
                changeEnergy(-50);
                changeMood(Mood.HAPPY);

                System.out.println("Mew... (Ngelirik dengan malas))");
                System.out.printf("%s menggigit dan menarik mainan bulu.%n", getName());
                System.out.printf("Energy: %d%%%n", getEnergy());
                System.out.printf("Mood: %s%n", getMood());
            }
        }
    }

    @Override
    public void eat() {
        if (!isTired()) {
            System.out.println("Meww... (Tidak tertarik)");
            System.out.printf("Sepertinya %s Masih Kenyang (no need that for meow).%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
        else {
            changeEnergy(+50);
            if (getMood() == Mood.MAD) changeMood(Mood.FLAT);

            System.out.println("Meow-meow! (Makan dengan lahap)");
            System.out.printf("%s sedang Memakan whiskas.%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
        }
    }

    @Override
    public Reaction annoy() {
        if (isMad()) {
            System.out.println("MEOOOWRRR! (marah besar)");
            System.out.printf("Sepertinya %s sangat marah (you are done broh).%n", getName());
            // System.out.printf("%s diambil oleh shop. %n", getName());
            return Reaction.AGGRESSIVE;
        }
        else {
            changeMood(Mood.MAD);

            System.out.println("MEOW!!! (Terkejut)");
            System.out.printf("%s tidak suka diperlakukan seperti itu (stop it lil bro).%n", getName());
            System.out.printf("Energy: %d%%%n", getEnergy());
            System.out.printf("Mood: %s%n", getMood());
            return Reaction.ANNOYED;
        }

    }

    @Override
    public void pet() {
        changeMood(Mood.HAPPY);
        changeEnergy(+5);

        System.out.println("Mrrp! (senang banget sampe nge-brrr)");
        System.out.printf("%s terlihat sangat menyukainya.%n", getName());
        System.out.printf("Energy: %d%%%n", getEnergy());
        System.out.printf("Mood: %s%n", getMood());
    }
}
