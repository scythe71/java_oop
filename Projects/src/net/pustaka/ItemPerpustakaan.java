package net.pustaka;

public abstract class ItemPerpustakaan {
    protected static int counter = 1;
    protected int id;
    protected String judul;
    protected boolean dipinjam;

    public ItemPerpustakaan(String judul) {
        this.id = counter++;
        this.judul = judul;
        this.dipinjam = false;
    }

    public abstract void info();

    public void pinjam() {
        dipinjam = true;
    }

    public void kembalikan() {
        dipinjam = false;
    }
}
