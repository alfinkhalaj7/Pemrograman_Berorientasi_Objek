package praktikum.sesi3;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan angka (masukkan 0 untuk berhenti):");

        // Menggunakan loop while untuk terus meminta input
        while (true) {
            angka = scanner.nextInt(); // Membaca input dari pengguna
            
            if (angka == 0) { // Mengecek apakah angka yang dimasukkan adalah 0
                break; // Keluar dari loop jika angka 0
            }
            
            System.out.println("Anda memasukkan angka: " + angka);
        }

        System.out.println("Program berhenti. Terima kasih!");
        scanner.close(); // Menutup scanner
    }
}
