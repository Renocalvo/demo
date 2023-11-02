#Konversi Decimal ke Binary

##Ini adalah program sederhana dalam bahasa Java yang mengonversi bilangan desimal menjadi representasi binernya. 
##Program ini akan mengambil input bilangan desimal dari pengguna dan menampilkan nilai biner yang sesuai. 

##Cara Menggunakan:
1. Jalankan program.
2. Masukkan bilangan desimal saat diminta.
3. Program akan mengonversi bilangan desimal menjadi biner dan menampilkan hasilnya.

##Deskripsi Program:
- Program ini menggunakan `Scanner` untuk mendapatkan input desimal dari pengguna.
- Program memanggil metode `decimalToBinary` untuk melakukan konversi.
- Metode `decimalToBinary` mengonversi bilangan desimal menjadi biner menggunakan perulangan dan operasi modulo.
- Hasil biner kemudian ditampilkan kepada pengguna.

##Metode: decimalToBinary
- Metode ini mengambil input berupa bilangan bulat (decimal) dan mengembalikan representasi biner dalam bentuk string.
- Metode ini menangani kasus khusus ketika inputnya adalah 0 dengan mengembalikan "0".
- Untuk input yang bukan 0, metode ini secara berulang menghitung representasi binernya dengan membagi bilangan desimal dengan 2 dan melacak sisa hasil bagi.
- Digit-digit biner ditambahkan ke dalam `StringBuilder` dalam urutan terbalik.
- Akhirnya, representasi biner diubah menjadi urutan yang benar dan dikembalikan sebagai string.

##Kontributor:
- Dibuat oleh Indra bayu

##Catatan:
- Program ini disediakan sebagai contoh pendidikan sederhana dan mungkin tidak menangani semua kasus uji atau validasi input. Disarankan untuk meningkatkan program ini untuk penggunaan praktis.

Silakan gunakan dan modifikasi program ini untuk keperluan pembelajaran atau proyek Anda.
