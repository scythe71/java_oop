package relasidm;
public class Mahasiswa{
    private String nim;
    private String nama;
    private String prodi;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return this.nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return this.prodi;
    }
}