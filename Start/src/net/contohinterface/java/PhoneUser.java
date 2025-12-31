package net.contohinterface.java;

public class PhoneUser {
    private final Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    void turnOnThePhone() {
        this.phone.powerOn();
    }

    void turnOffThePhone() {
        this.phone.powerOff();
    }

    void makePhoneLouder() {
        this.phone.volumeOn();
    }

    void makePhoneSilent() {
        this.phone.volumeOff();
    }
}
