package praktikum.sesi3;

import java.util.Scanner; 

public class soal4 {
    public static void main(String[] args) {
        int jumlahGenap = 0; // Variabel untuk menyimpan jumlah bilangan genap

        // Menggunakan perulangan for untuk menghitung bilangan genap antara 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Mengecek apakah bilangan adalah genap
                jumlahGenap += i; // Menambahkan bilangan genap ke jumlah
            }
        }

        // Menampilkan hasil jumlah bilangan genap
        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlahGenap);
    }
}
