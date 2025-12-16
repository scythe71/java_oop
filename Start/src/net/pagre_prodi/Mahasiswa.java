package net.pagre_prodi;
public class Mahasiswa {
    private String nim;
    private String nama;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String GetNama() {
        return this.nama;
    }
    public String GetNim() {
        return this.nim;
    }
}
