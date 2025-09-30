import java.util.Scanner;

public class Mahasiswa {

    private String nama;
    private String jekel;
    private int nim;
    
    public void setNama(String nama) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nama mahasiswa: ");
            nama = input.nextLine();
        }
    }

    public String getNama() {
        return nama;
    }

    public void setJekel(String jekel) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Jenis Kelamin mahasiswa: ");
            jekel = input.nextLine();
        }
    }
    
    public String getJekel() {
        return jekel;
    }

    public void setNim(int nim) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Nim mahasiswa: ");
            nim = input.nextInt();
        }
    }

    public int getNim() {
        return nim;
    }


    public static void main(String[] args) {
        
    }
}