/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Ramma Shadiqu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        BangunDatar BangunDatar = new BangunDatar();
        Persegi Persegi = new Persegi(4);
        Segitiga Segitiga = new Segitiga(6, 3);
        Lingkaran Lingkaran = new Lingkaran(50);
        
//        BangunDatar.luas();
//        BangunDatar.keliling();
        
        System.out.println("Luas Persegi: " + Persegi.luas());
        System.out.println("Keliling Persegi: " + Persegi.keliling());
        System.out.println("Luas Segitiga: " + Segitiga.luas());
        System.out.println("Luas Lingkaran: " + Lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + Lingkaran.keliling());
    }
    
}
