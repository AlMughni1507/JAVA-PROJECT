/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6no1;

import java.util.Scanner;

/**
 *
 * @author Mughni
 */
public class Pertemuan6no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("NIM ? : ");
        String NIM = input.nextLine();

        System.out.print("NAMA ? : ");
        String NAMA = input.nextLine();

        System.out.print("NILAI ? : ");
        double NILAI = input.nextDouble();

        // Menentukan grade berdasarkan nilai
        String grade;
        if (NILAI >= 85) {
            grade = "A";
        } else if (NILAI >= 75) {
            grade = "B";
        } else if (NILAI >= 65) {
            grade = "C";
        } else {
            grade = "D"; // Anda dapat menambahkan grade D untuk nilai di bawah 65
        }

        // Output grade
        System.out.println("Output : ");
        System.out.println("Grade : " + grade);

        // Jika NIM adalah 1112, tampilkan informasi tambahan
        if (NIM.equals("1112")) {
            System.out.println("Universitas Pamulang");
            System.out.println("Sistem Informasi");
            System.out.println("Pemrograman Berorientasi Objek (Java 1) 79");
            System.out.println("Sistem Informasi S-1");
        }

        input.close();
    }
}


