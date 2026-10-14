# Mini Project Java: Program Data Mahasiswa

## 1. Deskripsi Proyek

Program Data Mahasiswa merupakan mini project yang dibuat untuk memenuhi tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)** pada materi *Java Control Flow & Dasar OOP* minggu ke-3 dan minggu ke-4.

Program ini dibuat menggunakan bahasa pemrograman Java untuk mengelola data mahasiswa secara sederhana. Pengguna dapat memasukkan nama, Nomor Induk Mahasiswa (NIM), dan nilai mahasiswa. Program kemudian menampilkan data yang telah dimasukkan serta menentukan status kelulusan setiap mahasiswa berdasarkan nilai yang diperoleh.

Proyek ini juga bertujuan untuk menerapkan konsep dasar pemrograman Java, khususnya penggunaan variabel, tipe data, input menggunakan Scanner, percabangan, perulangan, class, object, dan method dalam satu program yang utuh.

## 2. Tujuan Program

Tujuan pembuatan program ini adalah:

- Memahami penggunaan variabel dan tipe data dalam Java.
- Menerapkan input data menggunakan `Scanner`.
- Menggunakan percabangan `if/else` untuk menentukan kelulusan mahasiswa.
- Menerapkan perulangan untuk memasukkan dan menampilkan data beberapa mahasiswa.
- Memahami konsep class dan object dalam Object-Oriented Programming (OOP).
- Membuat dan menggunakan method untuk mengelola data mahasiswa.
- Menggabungkan materi Control Flow dan dasar OOP dalam sebuah program sederhana.

## 3. Fitur Program

Program ini memiliki beberapa fitur utama, yaitu:

1. **Input jumlah mahasiswa**  
   Pengguna dapat menentukan jumlah mahasiswa yang datanya akan dimasukkan. Program menetapkan jumlah minimal sebanyak tiga mahasiswa.

2. **Input data mahasiswa**  
   Pengguna memasukkan nama, NIM, dan nilai untuk setiap mahasiswa.

3. **Penyimpanan data menggunakan object**  
   Setiap mahasiswa direpresentasikan sebagai objek dari class `Mahasiswa`.

4. **Menampilkan data mahasiswa**  
   Program menampilkan nama, NIM, dan nilai setiap mahasiswa.

5. **Pemeriksaan status kelulusan**  
   Program menentukan status kelulusan berdasarkan nilai mahasiswa.

6. **Pemrosesan data secara berulang**  
   Program menggunakan perulangan agar input dan penampilan data dapat dilakukan untuk beberapa mahasiswa tanpa menulis instruksi yang sama berulang kali.

## 4. Teknologi yang Digunakan

- **Bahasa pemrograman:** Java
- **Java Development Kit (JDK):** Untuk mengompilasi dan menjalankan program Java.
- **Editor kode:** Visual Studio Code (VS Code).
- **Terminal:** Terminal VS Code atau Command Prompt (CMD).
- **Version control dan penyimpanan kode:** GitHub.

## 5. Struktur File Proyek

Proyek ini terdiri atas dua file Java utama dan satu file dokumentasi.

```text
MiniProjectMahasiswa/
├── Mahasiswa.java
├── Main.java
└── README.md
```

Keterangan file:

- **`Mahasiswa.java`**  
  Berisi class `Mahasiswa`, atribut `nama`, `nim`, dan `nilai`, serta method `tampilkanData()` dan `cekKelulusan()`.

- **`Main.java`**  
  Merupakan program utama yang berisi method `main()`, input menggunakan `Scanner`, perulangan, pembuatan object mahasiswa, dan pemanggilan method dari class `Mahasiswa`.

- **`README.md`**  
  Berisi dokumentasi proyek, tujuan, fitur, teknologi, cara menjalankan program, serta contoh hasil program.

## 6. Konsep Java yang Diterapkan

### A. Variable

Variabel digunakan untuk menyimpan data yang dibutuhkan program. Contohnya adalah `nama`, `nim`, `nilai`, dan `jumlah`.

### B. Data Type

Program menggunakan beberapa tipe data, yaitu:

- `String` untuk menyimpan nama dan NIM mahasiswa.
- `double` untuk menyimpan nilai mahasiswa.
- `int` untuk menyimpan jumlah mahasiswa.

### C. Scanner

`Scanner` digunakan untuk menerima input dari pengguna melalui keyboard. Dengan demikian, pengguna dapat memasukkan data mahasiswa saat program dijalankan.

### D. If/Else

Percabangan `if/else` digunakan dalam method `cekKelulusan()` untuk menentukan status kelulusan mahasiswa. Jika nilai mahasiswa minimal 60, statusnya adalah Lulus. Jika nilainya kurang dari 60, statusnya adalah Tidak Lulus.

### E. Loop

Program menggunakan perulangan `while` untuk memastikan jumlah mahasiswa minimal tiga orang dan perulangan `for` untuk memasukkan serta menampilkan data mahasiswa.

### F. Class

Class `Mahasiswa` merupakan cetakan yang mendefinisikan atribut dan perilaku setiap objek mahasiswa.

### G. Object

Object dibuat dari class `Mahasiswa` menggunakan perintah `new Mahasiswa()`. Setiap objek menyimpan data mahasiswa yang berbeda.

### H. Method

Program menggunakan dua method utama:

- `tampilkanData()` untuk menampilkan informasi mahasiswa.
- `cekKelulusan()` untuk memeriksa dan menampilkan status kelulusan mahasiswa.

## 7. Ketentuan Kelulusan

Program menggunakan ketentuan kelulusan berikut:

| Rentang Nilai | Status |
|---|---|
| Nilai >= 60 | Lulus |
| Nilai < 60 | Tidak Lulus |

Ketentuan tersebut digunakan oleh method `cekKelulusan()` untuk menentukan hasil kelulusan secara otomatis.

## 8. Persyaratan Menjalankan Program

Sebelum menjalankan program, pastikan perangkat telah memiliki:

1. Java Development Kit (JDK) yang sudah terpasang.
2. Terminal atau Command Prompt untuk menjalankan perintah Java.
3. File `Mahasiswa.java` dan `Main.java` yang tersimpan dalam folder yang sama.

Untuk memeriksa apakah Java sudah terpasang, buka terminal dan jalankan:

```bash
java -version
javac -version
```

Jika kedua perintah menampilkan informasi versi, Java dan compiler Java dapat diakses melalui terminal.

## 9. Cara Menjalankan Program

### Langkah 1: Buka folder proyek

Buka folder `MiniProjectMahasiswa` melalui VS Code atau Command Prompt.

### Langkah 2: Kompilasi program

Jalankan perintah berikut untuk mengompilasi kedua file Java:

```bash
javac Mahasiswa.java Main.java
```

### Langkah 3: Jalankan program

Setelah kompilasi berhasil, jalankan perintah:

```bash
java Main
```

### Langkah 4: Masukkan data mahasiswa

Masukkan jumlah mahasiswa minimal tiga orang, kemudian masukkan nama, NIM, dan nilai setiap mahasiswa sesuai permintaan program.

### Langkah 5: Periksa hasil

Program akan menampilkan kembali data mahasiswa dan status kelulusan masing-masing berdasarkan nilai yang telah dimasukkan.

## 10. Contoh Pengujian Program

Berikut contoh data yang digunakan untuk menguji program:

| No. | Nama | NIM | Nilai | Status |
|---|---|---|---:|---|
| 1 | Farras | 25111 | 95 | Lulus |
| 2 | Rayyan | 25113 | 50 | Tidak Lulus |
| 3 | Imam | 25112 | 75 | Lulus |

### Contoh hasil output

```text
===== HASIL DATA MAHASISWA =====

Mahasiswa ke-1
Nama  : Farras
NIM   : 25111
Nilai : 95.0
Status: Lulus

Mahasiswa ke-2
Nama  : Rayyan
NIM   : 25113
Nilai : 50.0
Status: Tidak Lulus

Mahasiswa ke-3
Nama  : Imam
NIM   : 25112
Nilai : 75.0
Status: Lulus
```

Hasil pengujian menunjukkan bahwa program dapat menerima input, menyimpan data dalam objek mahasiswa, menampilkan informasi mahasiswa, dan menentukan status kelulusan sesuai ketentuan yang telah ditetapkan.

## 11. Hasil yang Diharapkan

Setelah program dijalankan, pengguna dapat memasukkan data beberapa mahasiswa dan memperoleh informasi nama, NIM, nilai, serta status kelulusan masing-masing. Program juga memastikan jumlah mahasiswa yang diproses minimal tiga orang.

## 12. Kesimpulan

Mini Project Program Data Mahasiswa merupakan penerapan dasar bahasa pemrograman Java yang menggabungkan materi Control Flow dan Object-Oriented Programming (OOP). Melalui proyek ini, konsep variabel, tipe data, Scanner, percabangan, perulangan, class, object, dan method diterapkan secara langsung.

Pemisahan program menjadi `Mahasiswa.java` dan `Main.java` membantu membuat kode lebih terstruktur dan mudah dipahami. Proyek ini juga menjadi latihan dasar dalam mengembangkan program Java serta mendokumentasikan dan menyimpan kode menggunakan GitHub.

---

**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Topik:** Java Control Flow & Dasar OOP  
**Jenis Tugas:** Mini Project Program Data Mahasiswa# FarrasArthadaSiregar-MiniProjectMahasiswa
