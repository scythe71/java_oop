import java.util.Scanner;
public class Mahanilai {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Jumlah Mahasiswa: ");
            int jml = input.nextInt();
            input.nextLine();

            int[] nilai = new int[jml];
            String[] nama = new String[jml];
            String[] status = new String[jml]; 

            for (int i = 0; i < jml; i++) {
                System.out.println("Mahasiswa ke: " + (i+1));

                System.out.print("Nama: ");
                nama[i] = input.nextLine();

                System.out.print("Nilai: ");
                nilai[i] = input.nextInt();
                input.nextLine();
            }

            System.out.println("DAFTAR NILAI MAHASISWA");
            System.out.println("======================");
            System.out.println("No\tNama\tNilai\tStatus");
            for (int i = 0; i < jml; i++) {
                if (nilai[i] > 70) {
                    status[i] = "Lulus";
                }
                else {
                    status[i] = "Tidak Lulus";
                }

                System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
            }
        }
    }
}



// import java.util.Scanner;

// public class DaftarNilaiMahasiswa {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Masukan Jumlah Mahasiswa : ");
//         int jumlah = sc.nextInt();
//         sc.nextLine();

//         String[] nama = new String[jumlah];
//         int[] nilai = new int[jumlah];

//         for (int i = 0; i < jumlah; i++) {
//             System.out.println("Mahasiswa Ke : " + (i + 1));
//             System.out.print("Nama : ");
//             nama[i] = sc.nextLine();
//             System.out.print("Nilai : ");
//             nilai[i] = sc.nextInt();
//             sc.nextLine();
//         }

//         System.out.println("=======================================");
//         System.out.println("DAFTAR NILAI MAHASISWA");
//         System.out.println("---------------------------------------");
//         System.out.println("NotNama\tNilai\tStatus");
//         for (int i = 0; i < jumlah; i++) {
//             String status = (nilai[i] >= 70) ? "Lulus" : "Tidak Lulus";
//             System.out.println((i + 1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status);
//         }
//     }
// }