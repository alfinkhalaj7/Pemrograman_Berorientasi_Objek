package praktikum.sesi3;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        double angka = scanner.nextDouble();
        
        if (angka > 0) {
            System.out.println("Angka tersebut positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut negatif.");
        } else {
            System.out.println("Angka tersebut nol.");
        }
        
        scanner.close();
    }
}
