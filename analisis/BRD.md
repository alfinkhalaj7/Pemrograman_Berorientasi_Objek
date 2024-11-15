# **Business Requirement Document (BRD)**  
**Sistem Informasi Data Guru**

## **1. Introduction**

#### **1.1 Purpose of Document**  
Dokumen ini dibuat untuk merancang kebutuhan bisnis sistem informasi pengelolaan data guru. Sistem ini bertujuan untuk mendukung manajemen data guru secara efektif dan efisien, mulai dari pencatatan data pribadi hingga laporan kinerja guru.

#### **1.2 Project Scope**  
Ruang lingkup sistem mencakup:  
1. Pengelolaan data guru (data pribadi, keahlian, sertifikasi, riwayat pekerjaan).  
2. Integrasi dengan modul kehadiran dan jadwal pelajaran.  
3. Laporan evaluasi kinerja dan rekam jejak aktivitas guru.  
4. Fitur approval untuk pengajuan izin atau cuti guru.  
5. Dashboard interaktif untuk administrasi.

---

## **2. System Requirements**

#### **2.1 Business Flow Data Guru**  

1. **Pencatatan Data Guru**  
   - Administrator memasukkan data guru baru, termasuk data pribadi, pendidikan, keahlian, dan sertifikasi.  
   - Data diverifikasi sebelum disimpan di sistem.  

2. **Pengelolaan Aktivitas Guru**  
   - Jadwal mengajar guru diintegrasikan dengan jadwal kelas.  
   - Kehadiran guru dicatat melalui sistem absensi (dapat berupa biometrik atau manual).  

3. **Evaluasi Kinerja Guru**  
   - Data dari evaluasi siswa, kepala sekolah, dan rekan sejawat dikumpulkan.  
   - Sistem menghasilkan laporan evaluasi kinerja otomatis berdasarkan data yang diinput.  

4. **Pengajuan Izin/Cuti Guru**  
   - Guru dapat mengajukan izin melalui sistem.  
   - Proses persetujuan mengikuti alur multi-level approval (Kepala Sekolah → HR).  

5. **Laporan dan Dashboard**  
   - Sistem menghasilkan laporan terkait data guru, kehadiran, kinerja, dan izin/cuti.  
   - Dashboard interaktif disediakan untuk administrasi sekolah.  

---

## **3. Business Requirement**

#### **3.1 Functional Requirements**

| No  | Modul                     | Kebutuhan Fungsional                                                                                                                                                     | Status             |
|-----|---------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------|
| 1   | Pencatatan Data Guru      | Insert, View, Update, Delete, Approval untuk data guru.                                                                                                                 | Modul Baru         |
| 2   | Absensi Guru              | Integrasi dengan sistem absensi (biometrik/manual). Meliputi pencatatan kehadiran dan keterlambatan.                                                                    | Modul Baru         |
| 3   | Jadwal Mengajar           | Penjadwalan otomatis berdasarkan alokasi mata pelajaran dan jadwal kelas.                                                                                              | Modul Baru         |
| 4   | Evaluasi Kinerja          | Input dan generate laporan evaluasi kinerja berdasarkan berbagai sumber data (siswa, kepala sekolah, sejawat).                                                         | Modul Baru         |
| 5   | Pengajuan Izin/Cuti       | Form pengajuan izin/cuti, dengan fitur approval multi-level dan notifikasi status pengajuan.                                                                             | Modul Baru         |
| 6   | Dashboard Administrasi    | Dashboard interaktif untuk mengelola data guru, absensi, jadwal, dan laporan.                                                                                          | Penyesuaian Modul  |
| 7   | Laporan                  | Laporan terkait data guru, evaluasi kinerja, kehadiran, dan izin/cuti.                                                                                                 | Custom Report      |

---

## **4. Approval Workflow**

| Modul             | Tingkat Approval                     | Penjelasan                                                                 |
|--------------------|--------------------------------------|---------------------------------------------------------------------------|
| Data Guru          | Admin Sekolah → Kepala Sekolah       | Verifikasi data guru oleh kepala sekolah sebelum masuk ke sistem.         |
| Absensi            | Admin Sekolah                       | Absensi diverifikasi sebelum direkap untuk laporan bulanan.               |
| Izin/Cuti          | Kepala Sekolah → HR                 | Pengajuan cuti melalui alur persetujuan multi-level.                      |

---

## **5. Timeline**

| Phase              | Deliverable                        | Waktu Pelaksanaan     |
|--------------------|------------------------------------|-----------------------|
| Analysis & Design  | Business Requirement Document (BRD) | 2 minggu              |
| Development        | Modul Data Guru, Absensi, Evaluasi | 6 minggu              |
| UAT                | User Acceptance Testing            | 2 minggu              |
| Training           | User Manual dan Pelatihan          | 1 minggu              |
| Go Live            | Peluncuran Sistem                 | 1 minggu              |

---

## **6. Dashboard dan Laporan**

#### **Dashboard**  
- **Data Guru**: Total guru, guru aktif, guru non-aktif.  
- **Kehadiran**: Statistik kehadiran bulanan.  
- **Kinerja**: Peringkat evaluasi guru.  

#### **Laporan**  
1. Data Guru: Laporan lengkap profil dan status guru.  
2. Kehadiran Guru: Rekap absensi bulanan.  
3. Evaluasi Kinerja: Hasil evaluasi berdasarkan indikator yang ditentukan.  
4. Pengajuan Izin/Cuti: Laporan izin atau cuti guru per periode.  
