package menu;
import java.util.Scanner;
public class Menu {
   public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            String[] menu = {"Kopi Hitam", "Cappucino", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
            int[] harga = {10000, 15000, 8000, 12000, 13000};
            
            System.out.println("===== SELAMAT DATANG DI KAFE RAMMA =====");
            System.out.println("Daftar Menu:");
            for(int i = 0; i < menu.length; i++){
                System.out.println((i + 1) + ". "+ menu[i] + "\t- Rp " + harga[i]);
            }
            
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int jumlahMenu = input.nextInt();
            
            int[] pilih = new int[jumlahMenu];
            int[] jumlah = new int[jumlahMenu];
            for(int i = 0; i < jumlahMenu; i++) {
               System.out.printf("Masukkan nomor menu ke-%d: ", (i + 1));
               pilih[i] = input.nextInt();
               System.out.printf("Jumlah pesanan untuk %s: ", menu[pilih[i] - 1]);
               jumlah[i] = input.nextInt();
            }
            
            
            System.out.println("========== STRUK PEMBAYARAN ==========");
            System.out.printf("%-15s %-5s %-10s%n", "Menu", "Qty", "Subtotal");
            System.out.println("----------------------------------------");
            
            int total = 0;
            for (int i = 0; i < jumlahMenu; i++) {
                int pos = pilih[i] - 1;
                int subtotal = harga[pos] * jumlah[i];
                total += subtotal;
                System.out.printf("%-15s %-5d Rp%d%n", menu[pos], jumlah[i], subtotal);
            }
            
            System.out.println("-----------------------------------------");
            System.out.printf("Total Bayar: Rp %d%n", total);
            
            System.out.print("Uang tunai: Rp ");
            int uang = input.nextInt();
            int kembalian = uang - total;
            System.out.printf("Kembalian: Rp %d%n \n", kembalian);
            System.out.println("Terima kasih telah berkunjung ke KAFE RAMMA!");
            
        }
    }
    
}
