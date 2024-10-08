/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no1;

/**
 *
 * @author Mughni
 */

import java.util.Scanner; // import/tambahkan library class Scanner
        

public class Pertemuan5no1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data karyawan       
        System.out.print("Masukkan Nama Karyawan: ");
        String Nama_Karyawan = input.nextLine(); 
        
        System.out.print("Alamat: ");
        String Alamat_Karyawan = input.nextLine();

        System.out.print("Masukkan Usia: ");
        double Usia = input.nextDouble();

        // Bersihkan buffer setelah nextDouble()
        input.nextLine(); 

        System.out.print("Masukkan Gaji (contoh: Rp 10000000): ");
        String gajiInput = input.nextLine();
        
        // Menghapus simbol 'Rp' dan spasi
        gajiInput = gajiInput.replace("Rp", "").replace(",", "").trim();
        
        try {
            // Konversi string menjadi double
            double Gaji_Karyawan = Double.parseDouble(gajiInput);
            
            // Output data karyawan
            System.out.println("\nOutput Pendataan Karyawan:");
            System.out.println("Nama Karyawan : " + Nama_Karyawan);
            System.out.println("Alamat : " + Alamat_Karyawan);
            System.out.println("Usia : " + Usia);
            System.out.println("Gaji : " + Gaji_Karyawan);
        } catch (NumberFormatException e) {
            System.out.println("Format gaji tidak valid. Masukkan angka yang benar.");
        }

        input.close();
    }
}

