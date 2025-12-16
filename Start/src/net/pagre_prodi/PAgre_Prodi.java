package net.pagre_prodi;
public class PAgre_Prodi {
    public static void main(String[] args) {
        // Objek Jurusan
        Jurusan j = new Jurusan("Teknologi Informasi dan komputer", "Politeknik Negeri Lhokseumawe");
        
        // Mahasiswa satu
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("2024573010129");
        m1.setNama("Ammar");

        // Mahasiswa dua
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("2024543010038");
        m2.setNama("Afdal");
        
        // Menambahkan mahasiswa kedalam array di jurusan TIK
        j.addMhs(m1);
        j.addMhs(m2);
        
        
        System.out.println("Kode Jurusan: " + j.getKode());
        System.out.println("Nama Kampus: " + j.getNama());
        System.out.println("List Daftar Mahasiswa: ");
        Mahasiswa[] daftar = j.getDaftarMhs();
        for (Mahasiswa m:daftar) {
            if(m != null) {
                System.out.println(" -" + m.GetNim() + " " + m.GetNama());
            }
        }
    }
}
