package net.pustaka;

public class Peminjam {
    private final Buku buku;

    public Peminjam(Buku buku) {
        this.buku = buku;
    }

    public void infoBuku() {
        this.buku.info();
    }
}
