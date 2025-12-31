package net.pustaka;

public class Perpustakaan {
    private final ItemPerpustakaan[] koleksi = new ItemPerpustakaan[10];
    private int jumlah = 0;

    public void tambah(ItemPerpustakaan item) {
        koleksi[jumlah++] = item;
    }

    public void kurang(ItemPerpustakaan item) {
        
    }

    public void tampilkan() {
        for (int i = 0; i < jumlah; i++) {
            koleksi[i].info();
        }
    }
}
