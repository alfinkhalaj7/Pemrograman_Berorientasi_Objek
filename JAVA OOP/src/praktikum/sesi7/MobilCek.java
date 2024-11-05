package praktikum.sesi7;

// Kelas Mobil
public class Mobil {
    public String merk;
    protected int tahunProduksi;
    private double harga;

    // Constructor
    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        setHarga(harga); // Gunakan setter untuk validasi harga awal
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk harga
    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    // Metode untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }
}

// Kelas utama untuk menjalankan program
class MobilCek {
    public static void main(String[] args) {

        // Membuat objek Mobil
        Mobil mobill = new Mobil("Toyota", 2022, 300000000);

        // Mengakses atribut public
        System.out.println("Merk Mobil: " + mobill.merk); // Output: Toyota

        // Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("Tahun Produksi Mobil: " + mobill.tahunProduksi); // Output: 2022

        // Mengakses atribut private menggunakan getter
        System.out.println("Harga Mobil: " + mobill.getHarga()); // Output: 300000000.0

        // Mengubah nilai atribut private menggunakan setter
        mobill.setHarga(350000000);
        System.out.println("Harga Mobil Setelah Diubah: " + mobill.getHarga()); // Output: 350000000.0

        // Menampilkan informasi lengkap mobil
        mobill.tampilkanInfoMobil();
    }
}
