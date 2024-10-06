package praktikum.sesi1;

import java.util.Scanner;


public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu, subMenu;
        int angkaPertama, angkaKedua, hasil1, hasil2, hasil3, hasil4;

    
        System.out.println("===========================================");
        System.out.println("Nama : Alfin Khalaj Syahruwardi");
        System.out.println("NIM  : 20230801465");
        System.out.println("===========================================\n");
        scanner.nextLine(); // Pause

        while (true) {
            System.out.println("\n===========================================");
            System.out.println("Aplikasi Kalkulator");
            System.out.println("===========================================");
            System.out.println("1. Memulai Kalkulator");
            System.out.println("2. Keluar Aplikasi");
            System.out.print("Pilihan Menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("\nMasukkan Angka Pertama: ");
                    angkaPertama = scanner.nextInt();
                    System.out.print("Masukkan Angka Kedua: ");
                    angkaKedua = scanner.nextInt();

                    hasil1 = angkaPertama + angkaKedua;
                    hasil2 = angkaPertama - angkaKedua;
                    hasil3 = angkaPertama * angkaKedua;
                    if (angkaKedua != 0) {
                        hasil4 = angkaPertama / angkaKedua;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diizinkan!");
                        hasil4 = 0;
                    }

                    System.out.println("\nHasil Perhitungan:");
                    System.out.println(angkaPertama + " + " + angkaKedua + " = " + hasil1);
                    System.out.println(angkaPertama + " - " + angkaKedua + " = " + hasil2);
                    System.out.println(angkaPertama + " * " + angkaKedua + " = " + hasil3);
                    System.out.println(angkaPertama + " / " + angkaKedua + " = " + hasil4);
                    System.out.println("Hampura Sadayana Kalo Ada Yang Salah...\n");
                    break;


                default:
                    System.out.println("Masukkan pilihan dengan benar.");
                    break;
            }

            // Menu pilihan setelah perhitungan
            System.out.println("\n====================");
            System.out.println("Pilihan Menu");
            System.out.println("====================");
            System.out.println("1. Kembali Ke Awal");
            System.out.println("2. Keluar Aplikasi");
            System.out.print("Pilihan Menu: ");
            subMenu = scanner.nextInt();

            if (subMenu == 2) {
                System.out.println("Terima kasih telah menggunakan aplikasi:)");
                break;
            }
        }
        scanner.close();
    }
}

