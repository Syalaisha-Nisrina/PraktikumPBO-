# <h1 align="center">Laporan Praktikum 4</h1>
<p align="center">Syalaisha Nisrina Anataya</p>

## Overview Tugas 
NightFall Clinic Management System adalah aplikasi berbasis Java yang dirancang untuk mengelola informasi dokter, pasien, dan janji temu dengan menerapkan prinsip Object-Oriented Programming (OOP). Sistem ini memastikan keamanan data pasien melalui enkapsulasi dan menyediakan fitur tambahan seperti validasi data dan diagnosis counter.
## Class Docter
Menggambarkan daata seorang dokterdengan atribut berikut:
- id: Identitas unik dokter.
- nama: Nama dokter.
- spesialisasi: Bidang spesialisasi dokter.
Class ini menggunakan Enkapsulasi getter dan setter. Kemudian untuk membuat tidak adanya kesalahan dalam input digunakan DataChecker.

## Class  Patient
Class ini menggambarkan data pasien dengan atribut :
- id: id: Identitas unik pasien..
- nama: Nama pasien.
- age: Umur pasien.
- diagnosis: Diagnosa penyakit pasien.
Class ini menggunakan konstruksi yang memvalidasi ID dan nama sebelum menyimpan datanya.Class ini juga menggunakan getter dan setter untuk mengonrol akses atribut.

## Appointment
Class ini menggambaarkan janji temu antara dokter dan pasien. Atribut :
- doctor (Doctor) : Objek dokter terkait.
- patient (Patient) : Objek pasien terkait.
- date (String) : Tanggal janji temu.
Kelas ini menghubungkan Doctor dan Patient, membentuk hubungan one-to-many (satu dokter bisa memiliki banyak janji temu dengan pasien yang berbeda)

## Data Checker 
Kelas DataChecker digunakan untuk memvalidasi ID dan nama agar tidak kosong atau tidak valid. Metode yang digunakan :
validateID(String id): Memeriksa apakah ID tidak kosong.
validateName(String name): Memeriksa apakah nama tidak kosong.


##KESIMPULAN :
Sistem ini menerapkan prinsip Object-Oriented Programming (OOP) dengan:

1. Enkapsulasi: Data dokter dan pasien terlindungi dengan private fields dan getter/setter.

2. Packages: Struktur direktori Unguided.entities digunakan untuk modularitas kode.

3. Relasi Antar Kelas: Appointment menghubungkan Doctor dan Patient, mencerminkan hubungan one-to-many.

4. DataChecker: Memastikan validitas input untuk mencegah data yang tidak sesuai.

5. DiagnosisCounter: Memudahkan analisis jumlah pasien berdasarkan diagnosis mereka.
