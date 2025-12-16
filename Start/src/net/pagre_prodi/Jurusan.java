package net.pagre_prodi;
public class Jurusan {
    private final String kode, nama;
    private final Mahasiswa daftarMhs[] = new Mahasiswa[11];
    private int jmlMhs;
    
    public Jurusan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }
    public String getKode() {
        return this.kode;
    }
    public String getNama() {
        return this.nama;
    }
    public int getJmlMhs() {
        return this.jmlMhs;
    }
    public void addMhs(Mahasiswa m) {
        if(jmlMhs < this.daftarMhs.length) {
            daftarMhs[jmlMhs] = m;
            jmlMhs++;
        }
    }
    public Mahasiswa[] getDaftarMhs() {
        return this.daftarMhs;
    }
}