// Package dan Import
package praktikum.sesi1.sesi2;
import java.util.Scanner;

public class Quis1 {
    public static void main(String[] args) {
        // Inisialisasi scanner dan variabel
        Scanner scanner = new Scanner(System.in);
        int menu, subMenu;
        int angkaPertama, angkaKedua, hasil1, hasil2, hasil3, hasil4;

        // Informasi Identitas
        System.out.println("===========================================");
        System.out.println("Nama : Alfin Khalaj Syahruwardi");
        System.out.println("NIM  : 20230801465");
        System.out.println("===========================================\n");
        scanner.nextLine(); // Pause

        // Bagian ini WHILE: Menu utama menggunakan perulangan while
        while (true) {
            System.out.println("\n===========================================");
            System.out.println("Aplikasi Kalkulator");
            System.out.println("===========================================");
            System.out.println("1. Memulai Kalkulator");
            System.out.println("2. Keluar Aplikasi");
            System.out.print("Pilihan Menu: ");
            menu = scanner.nextInt();

            // Bagian ini SWITCH: Memilih menu kalkulator atau keluar
            switch (menu) {
                case 1:
                    System.out.print("\nMasukkan Angka Pertama: ");
                    angkaPertama = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    angkaKedua = scanner.nextInt();

                    // Bagian ini IF: Pembagian dengan pengecekan nol
                    if (angkaKedua != 0) {
                        hasil4 = angkaPertama / angkaKedua;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diizinkan!");
                        hasil4 = 0;
                    }

                    // Perhitungan menggunakan operator aritmatika
                    hasil1 = angkaPertama + angkaKedua;
                    hasil2 = angkaPertama - angkaKedua;
                    hasil3 = angkaPertama * angkaKedua;

                    // Bagian ini FOR: Menampilkan hasil perhitungan menggunakan for loop
                    System.out.println("\nHasil Perhitungan:");
                    String[] operasi = {"+", "-", "*", "/"};
                    int[] hasil = {hasil1, hasil2, hasil3, hasil4};
                    for (int i = 0; i < operasi.length; i++) {
                        System.out.println(angkaPertama + " " + operasi[i] + " " + angkaKedua + " = " + hasil[i]);
                    }
                    System.out.println("Hampura Sadayana Kalo Ada Yang Salah...\n");
                    break;

                default:
                    System.out.println("Masukkan pilihan dengan benar.");
                    break;
            }

            // Bagian ini DO WHILE: Pilihan setelah perhitungan
            do {
                System.out.println("\n====================");
                System.out.println("Pilihan Menu");
                System.out.println("====================");
                System.out.println("1. Kembali Ke Awal");
                System.out.println("2. Keluar Aplikasi");
                System.out.print("Pilihan Menu: ");
                subMenu = scanner.nextInt();

                // Bagian ini IF: Memilih untuk keluar dari aplikasi atau kembali
                if (subMenu == 2) {
                    System.out.println("Terima kasih telah menggunakan aplikasi :)");
                    break;
                } else if (subMenu != 1) {
                    System.out.println("Masukkan pilihan yang valid.");
                }
            } while (subMenu != 1 && subMenu != 2);

            // Jika user memilih keluar, hentikan while loop utama
            if (subMenu == 2) {
                break;
            }
        }

        // Menutup scanner
        scanner.close();
    }
}
