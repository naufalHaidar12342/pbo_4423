/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorSederhana;

/**
 *
 * @author GIGABYTE
 */

import java.util.Scanner;

public class JalankanKalkulator {
    public static void main(String[] args) {
        Scanner tampungPilihan = new Scanner(System.in);

        int angka1, angka2, operasi;
        System.out.println("masukkan 2 angka yang dioperasikan =");
        angka1 = tampungPilihan.nextInt();
        angka2 = tampungPilihan.nextInt();

        System.out.println("pilih operasi =");
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");
        System.out.println("5. sisa bagi");

        System.out.println("pilih operasi (1/2/3/4/5) :");
        operasi = tampungPilihan.nextInt();
        MesinKalkulator wadah = new MesinKalkulator();
        try {
            if (operasi == 1) {
                int tampilkan;
                tampilkan = wadah.jalankanPenjumlahan(angka1, angka2);
                System.out.println("jawabannya adalah " + tampilkan);
            } else if (operasi == 2) {
                int tampilkan;
                // hasil = 0;
                tampilkan = wadah.jalankanPengurangan(angka1, angka2);
                System.out.println("jawabannya adalah " + tampilkan);
            } else if (operasi == 3) {
                int tampilkan;
                // hasil = 0;
                tampilkan = wadah.jalankanPerkalian(angka1, angka2);
                System.out.println("jawabannya adalah " + tampilkan);
            } else if (operasi == 4) {
                int tampilkan;
                // hasil = 0;
                tampilkan = wadah.jalankanPembagian(angka1, angka2);
                System.out.println("jawabannya adalah " + tampilkan);

            } else if (operasi == 5) {
                int tampilkan;
                // hasil = 0;
                tampilkan = wadah.jalankanSisaBagi(angka1, angka2);
                System.out.println("jawabannya adalah " + tampilkan);
            } else {
                System.out.println("masukkan operasi yang sesuai");
            }
        } finally {
            tampungPilihan.close();
        }

    }
}
