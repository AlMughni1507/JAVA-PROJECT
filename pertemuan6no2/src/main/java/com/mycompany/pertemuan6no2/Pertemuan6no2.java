/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6no2;

import java.util.Scanner;

/**
 *
 * @author Mughni
 */
public class Pertemuan6no2 {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan NIM: ");
        int NIM = input.nextInt();
        input.nextLine(); // Membersihkan buffer
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();
        
        // Menentukan grade dan keterangan
        if (nilai > 100) {
            System.out.println("Maksimal nilai hanya 100.");
        } else if (nilai < 0) {
            System.out.println("Nilai tidak bisa negatif.");
        } else if (nilai >= 85) {
            System.out.println("Grade: A");
            System.out.println("Keterangan: Lulus");
        } else if (nilai >= 75) {
            System.out.println("Grade: B");
            System.out.println("Keterangan: Lulus");
        } else if (nilai >= 65) {
            System.out.println("Grade: C");
            System.out.println("Keterangan: Lulus");
        } else {
            System.out.println("Mohon maaf, Anda dinyatakan tidak lulus.");
        }

        input.close(); // Menutup Scanner
    }
}


