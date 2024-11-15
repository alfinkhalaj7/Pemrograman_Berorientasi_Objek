## **Analisis Kebutuhan Sistem Data Guru**

### **1. Pendahuluan**  
Pengelolaan data guru adalah proses penting dalam administrasi sekolah yang mencakup pencatatan, pemantauan, dan evaluasi. Sistem yang ada saat ini sering kali bersifat manual atau tersebar, sehingga menimbulkan kendala dalam efisiensi dan akurasi data. Analisis kebutuhan ini bertujuan untuk merumuskan kebutuhan bisnis agar sistem informasi yang dibangun mampu memenuhi kebutuhan pengelolaan data guru secara komprehensif.

---

### **2. Analisis Masalah**  

| **Masalah**                                                | **Dampak**                                                                                     | **Solusi yang Diusulkan**                                                                         |
|------------------------------------------------------------|------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| Data guru masih dikelola secara manual di berbagai dokumen. | Sulit mencari informasi, rentan terjadi kesalahan input, dan kurang efisien.                  | Sistem terpusat untuk pencatatan, pengelolaan, dan pencarian data guru secara digital.           |
| Tidak adanya integrasi data absensi guru.                  | Data kehadiran tidak konsisten, sulit melakukan rekapitulasi kehadiran untuk evaluasi kinerja. | Integrasi dengan sistem absensi berbasis biometrik atau manual yang terhubung dengan sistem utama. |
| Penjadwalan mengajar dilakukan secara terpisah.            | Jadwal sering bentrok, dan pembagian tugas guru kurang optimal.                               | Modul penjadwalan otomatis berdasarkan alokasi mata pelajaran, kelas, dan ketersediaan guru.    |
| Evaluasi kinerja dilakukan secara subjektif.               | Penilaian kinerja kurang akurat dan sulit diukur secara objektif.                             | Sistem evaluasi berbasis indikator terukur yang dapat diakses dari berbagai sumber data.         |
| Pengajuan izin/cuti tidak terdokumentasi dengan baik.      | Data izin atau cuti hilang atau tidak terdokumentasi, memperlambat proses persetujuan.         | Fitur pengajuan izin/cuti berbasis form digital dengan alur persetujuan terotomatisasi.          |

---

### **3. Tujuan Sistem**  
1. Mempermudah pengelolaan data guru melalui sistem informasi terintegrasi.  
2. Menyediakan data guru yang akurat dan up-to-date untuk mendukung pengambilan keputusan.  
3. Meningkatkan efisiensi manajemen kehadiran, jadwal mengajar, dan evaluasi kinerja.  
4. Mempercepat proses pengajuan izin/cuti dengan alur persetujuan digital.  
5. Menyediakan laporan komprehensif terkait data guru, absensi, dan kinerja.  

---

### **4. Stakeholders Analisis**  

| **Stakeholder**     | **Peran dan Tanggung Jawab**                                                                                       | **Kebutuhan**                                                                                       |
|---------------------|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| **Administrator**   | Mengelola data guru, jadwal mengajar, kehadiran, dan cuti.                                                       | Sistem yang mudah digunakan dengan akses penuh untuk pengelolaan data.                            |
| **Guru**            | Memberikan data diri, mengakses jadwal, mengajukan izin/cuti, dan menerima evaluasi kinerja.                     | Sistem transparan untuk jadwal dan evaluasi serta pengajuan izin yang cepat.                      |
| **Kepala Sekolah**  | Menyetujui data, jadwal, dan izin, serta memonitor evaluasi kinerja guru.                                         | Dashboard untuk melihat data guru secara menyeluruh dan laporan evaluasi kinerja.                 |
| **HR (SDM)**        | Mengelola proses evaluasi kinerja, cuti, dan kehadiran guru dalam konteks administrasi SDM sekolah.              | Data evaluasi dan laporan izin/cuti yang terintegrasi dengan modul HR.                            |
| **Siswa (Opsional)**| Memberikan feedback atau data untuk mendukung evaluasi kinerja guru.                                             | Kemudahan dalam memberikan masukan kinerja melalui formulir atau survei.                          |

---

### **5. Functional Requirement Analysis**  

#### **5.1 Data Guru**
- **Input Data Guru**: Data pribadi, riwayat pendidikan, keahlian, dan sertifikasi.  
- **Update Data Guru**: Perubahan status guru, riwayat pelatihan, dan promosi jabatan.  
- **View Data Guru**: Pencarian dan pengelompokan berdasarkan kategori (aktif, non-aktif, spesialisasi).  

#### **5.2 Kehadiran Guru**
- **Absensi**: Data kehadiran harian dengan integrasi sistem biometrik atau manual.  
- **Rekap Kehadiran**: Rekapitulasi bulanan dan tahunan untuk mendukung evaluasi kinerja.  

#### **5.3 Jadwal Mengajar**
- **Penjadwalan Otomatis**: Alokasi mata pelajaran, ketersediaan kelas, dan kapasitas guru.  
- **Penyesuaian Manual**: Admin dapat melakukan perubahan jika diperlukan.  

#### **5.4 Evaluasi Kinerja Guru**
- **Indikator Evaluasi**: Meliputi kehadiran, hasil survei siswa, penilaian kepala sekolah, dan rekan sejawat.  
- **Laporan Evaluasi**: Peringkat dan rekomendasi berdasarkan skor evaluasi.  

#### **5.5 Pengajuan Izin/Cuti**
- **Form Digital**: Form pengajuan izin dengan alasan, tanggal mulai, dan durasi.  
- **Alur Persetujuan**: Kepala sekolah → HR, dengan status terlihat oleh pemohon.  

#### **5.6 Dashboard**
- **Dashboard Guru**: Statistik kehadiran, evaluasi, dan jadwal individu.  
- **Dashboard Admin**: Rekap data guru, absensi, jadwal, dan izin/cuti.  

---

### **6. Non-Functional Requirement Analysis**
- **Keamanan Data**: Sistem harus memiliki autentikasi user dan pengelolaan akses berbasis peran.  
- **Ketersediaan Sistem**: Sistem harus memiliki uptime minimal 99,5%.  
- **Kemudahan Penggunaan**: Antarmuka yang ramah pengguna untuk berbagai level user.  
- **Integrasi**: Sistem harus terhubung dengan sistem absensi dan modul lainnya.  
- **Performansi**: Sistem harus mampu menangani data untuk lebih dari 500 guru tanpa penurunan performa.  

---