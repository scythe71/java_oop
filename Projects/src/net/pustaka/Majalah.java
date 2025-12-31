package net.pustaka;

public class Majalah extends ItemPerpustakaan {
    protected int edisi;
    
    public Majalah(String judul, int edisi) {
        super(judul);
        this.edisi = edisi;
    }

    @Override
    public void info() {
        System.out.println("Informasi Majalah: ");
        System.out.println(getJudul() + " - " + getEdisi() + "\n");
    }

    public String getJudul() {
        return judul;
    }

    public int getEdisi() {
        return edisi;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }
}
