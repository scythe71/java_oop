/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Ramma Shadiqu
 */
public class BangunDatar {
    int r;
    int d;
    
    public float luas() {
        return (float) (Math.PI * (this.r * this.r));
    }
    
    public float keliling() {
        return (float) (1/4 * Math.PI * (this.d * this.d));
    }
}
