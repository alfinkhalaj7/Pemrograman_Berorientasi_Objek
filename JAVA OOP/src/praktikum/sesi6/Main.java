package praktikum.sesi6;

class Buku {
    // Atribut dari kelas Buku
    String judul;
    String penulis;
    int tahunTerbit;

    // Konstruktor untuk menginisialisasi objek Buku
    Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    void tampilkanInfo() {
        System.out.println("+-----------------------------");
        System.out.println("|Judul        : " + judul);
        System.out.println("|Penulis      : " + penulis);
        System.out.println("|Tahun Terbit : " + tahunTerbit);
        System.out.println("+-----------------------------");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Buku
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        
        // Menampilkan informasi buku
        buku1.tampilkanInfo();
    }
}
