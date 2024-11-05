package praktikum.sesi6;

class Mahasiswa {
    // Definisi class Mahasiswa
    String nama;
    String nim;
    String jurusan;
    double ipk;

    // Constructor untuk menginisialisasi atribut objek
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("IPK: " + this.ipk);
    }

    // Method untuk mengecek apakah mahasiswa mendapatkan penghargaan
    public void cekPenghargaan() {
        if (this.ipk >= 3.5) {
            System.out.println(this.nama + " mendapatkan penghargaan karena IPK tinggi.");
        } else {
            System.out.println(this.nama + " tidak mendapatkan penghargaan.");
        }
    }
}

public class ClassMahasiswa {
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Fatih", "123456", "Informatika", 3.8);
        Mahasiswa mhs2 = new Mahasiswa("Hamas", "654321", "Teknik Elektro", 3.2);

        // Memanggil method untuk menampilkan informasi dan cek penghargaan
        System.out.println("Informasi Mahasiswa 1:");
        mhs1.tampilkanInfo();
        mhs1.cekPenghargaan();

        System.out.println("\nInformasi Mahasiswa 2:");
        mhs2.tampilkanInfo();
        mhs2.cekPenghargaan();
    }
}