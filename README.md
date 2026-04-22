# Jobsheet-9

## Percobaan 1
1. Bagian yang perlu diperbaiki untuk mencetak daftar:
Pada jobsheet, iterasi dalam method `print()` tertulis `for (int i = 0; i <= top; i++)`. Ini salah karena akan mencetak tumpukan dari yang paling bawah (pertama masuk) ke atas. Agar sesuai dengan output yang terurut dari tumpukan paling atas (seperti stack pada umumnya), iterasinya harus dibalik menjadi `for (int i = top; i >= 0; i--)`.
2. Kapasitas Stack:
Terdapat 5 data tugas mahasiswa yang dapat ditampung. Potongan kodenya berada di dalam `MahasiswaDemo:`
`StackTugasMahasiswa stack = new StackTugasMahasiswa(5);`
3. Fungsi !isFull() pada method push:
Pengecekan ini berfungsi untuk mencegah data masuk ketika array sudah mencapai batas maksimumnya (mencegah Stack Overflow). Jika if-else ini dihapus dan kita memaksakan memasukkan data ke-6, program akan langsung crash atau error dengan pesan `ArrayIndexOutOfBoundsException` karena pointer indeks mencoba mengisi slot memori array yang tidak ada.
4. Modifikasi melihat mahasiswa pertama (terbawah):
Sudah ditambahkan pada `class StackTugasMahasiswa` dengan nama `method peekBottom()` yang me-return nilai pada indeks stack[0], serta opsi Menu nomor 5 pada MahasiswaDemo.
5. Method menghitung banyak tugas:
Sudah ditambahkan method getBanyakTugas() yang mengembalikan nilai top + 1.

## Percobaan 2
1. Alur kerja method konversiDesimalKeBiner: 
Method ini bekerja dengan cara membagi nilai desimal dengan 2 secara terus-menerus. Pada setiap iterasi, sisa bagi (nilai % 2) akan dimasukkan (push) ke dalam StackKonversi. Setelah itu, proses pop dilakukan. Karena sifat Stack adalah LIFO (yang terakhir masuk, keluar pertama), urutan sisa pembagian tersebut otomatis terbalik ketika digabungkan ke dalam bentuk String. Pembalikan urutan inilah yang menghasilkan nilai biner yang tepat dari bilangan desimal.
2. Ubah kondisi menjadi while (kode != 0): 
Jika kondisinya diubah menjadi while (kode != 0), hasilnya untuk input normal (nilai 1-100) akan tetap sama persis. Alasannya, baik > 0 maupun != 0 sama-sama mengizinkan pembagian selama bilangannya belum habis menjadi 0. Perbedaannya hanya akan terasa jika kita memasukkan angka negatif, di mana != 0 akan merespon dan memproses angka negatif tersebut ke dalam loop, sedangkan > 0 akan langsung mengabaikannya. Mengingat konteksnya adalah nilai tugas, menggunakan > 0 terasa sedikit lebih aman untuk mencegah infinite loop jika entah bagaimana input nilai menjadi negatif.