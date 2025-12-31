package net.pustaka;

public class Buku extends ItemPerpustakaan {
    protected String penulis;
    
    public Buku(String judul, String penulis) {
        super(judul);
        this.penulis = penulis;
    }

    @Override
    public void info() {
        System.out.println("Informasi Buku: ");
        System.out.println(getJudul() + " - " + getPenulis() + "\n");
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }
}