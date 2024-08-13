/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan4no2;

/**
 *
 * @author Mughni
 */
public class Pertemuan4no2 {
     /**
     * @param args the command line arguments 
     */

    public static void main(String[] args) {
       int w, x, y, z;
       x = 6;
       w = 5;
       
       y = 8 - x++;
       z = 8 - ++w;
       
       //menampilkan nilai w, x, y, z,
       System.out.println("Nilai x = " + x); // Setelah oprasi, x = 7
       System.out.println("Nilai w = " + w); // Setelah oprasi, w = 6
       System.out.println("Nilai y = " + y); // y = 8 - 6 = 2
       System.out.println("Nilai z = " + z); // z = 8 - 6 = 2
       
       
    }
}
