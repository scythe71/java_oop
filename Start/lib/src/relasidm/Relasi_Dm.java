package relasidm;
public class Relasi_Dm{
    public static void main(String[] args) {
        Mahasiswa ml = new Mahasiswa();
        ml.setNim("2024573010129");
        ml.setNama("Ammar");
        Mahasiswa ml2 = new Mahasiswa();
        ml2.setNim("2024573010038");
        ml2.setNama("Afdhal");
        Dosen d = new Dosen();
        d.setNidn("2230214002000");
        d.setNimMhs(ml.getNim());
        d.setNimMhs(ml2.getNim());

        System.out.println("Kode Dosen: " + d.getNidn());
        System.out.println("Mengajar mahasiswa: ");

        int jum = d.getJmlMhs();

        for(int i = 0; i < jum; i++) {
            System.out.println(" -" + d.getNimMhs(i));
        }
    }
}