/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8no1;

import java.util.Scanner;

/**
 *
 * @author Mughni
 */
public class Pertemuan8no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = input.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = input.nextInt();
        
        System.out.println("Output:");
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(i);
        }

        input.close();
    }
}


