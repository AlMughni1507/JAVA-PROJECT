/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan7no2;

import java.util.Scanner;

/**
 *
 * @author Mughni
 */
public class Pertemuan7no2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input data pengguna
        System.out.print("NIM : ");
        int NIM = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("NAMA : ");
        String Nama = input.nextLine();

        System.out.print("TAHUN: ");
        int Tahun = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("PILIH PEMINATAN : ");
        char Peminatan = input.nextLine().charAt(0);

        // Menentukan peminatan berdasarkan tahun dan pilihan
        String peminatanOutput = "";

        if (Tahun == 3) {
            if (Peminatan == 'M') {
                peminatanOutput = "PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2";
            } else if (Peminatan == 'T') {
                peminatanOutput = "Peminatan tidak valid.";
            } else {
                peminatanOutput = "Peminatan tidak valid.";
            }
        } else {
            peminatanOutput = "Tahun tidak valid.";
        }

        // Menampilkan hasil
        System.out.println("\nOutput:");
        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + Nama);
        System.out.println("TAHUN : " + Tahun);
        System.out.println("PILIH PEMINATAN : " + Peminatan);
        System.out.println(peminatanOutput);

        input.close();
    }
}



