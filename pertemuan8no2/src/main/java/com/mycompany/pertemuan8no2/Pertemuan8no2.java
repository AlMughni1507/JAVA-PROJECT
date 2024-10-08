/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8no2;

import java.util.Scanner;

/**
 *
 * @author Mughni
 */
public class Pertemuan8no2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = input.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = input.nextInt();
        
        System.out.println("Hasilnya ?:");
        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }

        input.close();
    }
}


