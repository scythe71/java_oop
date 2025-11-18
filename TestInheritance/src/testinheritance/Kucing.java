/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testinheritance;

/**
 *
 * @author Ramma Shadiqu
 */
public class Kucing {
    final String warna = "Oyen";

//    @Override
    public void bersuara() {
        System.out.println("meong! meong!");
    }
    
    public void warnain() {
        System.out.println(warna);
        System.out.println(super.warna);
    }
    
    public void bunyiin() {
        bersuara();
        super.bersuara();
    }
}
