# PBO-Tugas1

# Program Pemesanan Makanan Online
Hi! Ini adalah proyek kecil untuk pemesanan makanan online demi menuntaskan Tugas I PBO KAMI.

Program Java ini dirancang untuk dua jenis user dengan akses yang berbeda, yaitu:
1. Admin diberikan akses untuk melihat restoran, menambahkan restoran, dan menghapus restoran.
2. Customer diberikan akses untuk melihat restoran, membuat pesanan, dan melihat pesanan.

Program ini juga dilengkapi dengan input validasi pada class Input untuk memastikan pengguna memberikan input yang sesuai dengan yang dibutuhkan oleh program.

Di bawah ini adalah deskripsi program, penjelasan dari bagaimana program akan dijalankan, dan UML dari program ini. Untuk deskripsi kode lebih lengkap dapat dilihat pada kode program yang sudah dicommit sebelumnya (sudah disertakan beberapa comment untuk membantu dalam mengerti cara kerja program). Selamat menyimak :>


# Identitas Kami
* Nama  : Putu Rifki Dirkayuda
  NIM   : 2305551068
  Matkul: PBO (F)

* Nama  : Nyoman Tri Darma Wahyudi
  NIM   : 2305551052
  Matkul: PBO (F)

# UML
![WhatsApp Image 2024-05-03 at 10 21 35](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/698d5ffa-7cf3-49ce-8508-25b713c335b5)


# Bagaimana Program Di jalankan
Program ini di jalankan dengan menerapkan konsep Object Oriented Programming yaitu:
1. Penggunaan Class dan Oject
2. Penggunaan Flow Control seperti While loop, for each loop, do while loop, if-else, dan switch case
3. Array list
4. Inheritance
5. Nested Class
6. Enscapsulasi

# Penggunaan Program
Di bawah ini merupakan penggunaan program pemesanan online beserta hasil screenshoot. Beberapa penjelasan bagaimana kode berjalan di jelaskan di bawah.
# Login Admin dan Customer
![Screenshot 2024-05-03 085659](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/1e7b29ca-4f7b-4e38-9f52-6ed91c746c3f)
![Screenshot 2024-05-03 085707](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/9e75bc89-b6ae-4b1e-b7ea-b819df2fb05b)
![Screenshot 2024-05-03 085712](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/2983383e-e24b-4b96-91ba-67f8bcd98b58)
![Screenshot 2024-05-03 090445](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/bcf2aa0e-0f66-4c53-b000-9549e758fb56)
![Screenshot 2024-05-03 090450](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/8739f264-df4b-44ed-8473-1838ad0c9871)
Setelah user memilih melaukan login sebagai siapa, user akan diminta untuk menginputkan username dan password meereka. Jika benar maka akan mengeluarkan output seperti gambar di atas, bila salah maka user akan keluar perintah untuk memberikan user dan password yang benar lalu user kembali diminta untuk memilih login sebagai siapa, seperti gambar di atas.

# Menu Administrator 
![Screenshot 2024-05-03 085717](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/f681715b-d274-42ab-ba9a-2134a2af5597)
Setelah melakukan login sebagai administrator, maka user akan diberi intruksi kembali pada menu admin seperti gambar di atas. Admin akan diminta untuk memilih opsi di atas dengan menginputkan angka

# Menu Customer
![Screenshot 2024-05-03 090506](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/2402cea6-be7e-49bb-b401-2fedd002ec6e)
Setelah melakukan login sebagai customer, maka user akan diberi instruksi kembali pada menu customer seperti gambar di atas. Customer akan diminta untuk memilih opsi di atas dengan menginputkan angka

# Lihat Restoran
![Screenshot 2024-05-03 085916](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/05f2f7d2-0080-419f-9041-832a74b2d9cb)
Admin dan Customer bisa melihat restoran yang ada seperti pada list yang tertera pada screenshoot di atas. Dengan memberikan input berupa id restoran, pengguna dapat melihat makanan dan minuman yang tersedia pada restoran seperti pada gambar di bawah.

![Screenshot 2024-05-03 085951](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/1bf4a080-9c18-4ba0-b6ba-460133f4cdc6)
![Screenshot 2024-05-03 085959](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/b61a4ec7-6e96-49f5-8e98-927bf0534018)
![gambar](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/b9c5ee32-75f5-4fab-9f0d-fe4ded7eb768)
Pada gambar di atas merupakan list menu makanan dan minuman.

# Tambah Restoran Baru
![Screenshot 2024-05-03 085741](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/116c6c1a-0bf5-47ec-b2f6-39c5aa46e938)
![Screenshot 2024-05-03 085809](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/68280762-035d-4829-ba60-57aa97c45b98)
![Screenshot 2024-05-03 085830](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/1fc5b30e-7164-4b38-bc3f-ddac46a01ffd)
![Screenshot 2024-05-03 085843](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/362641f3-cfc0-4f58-a847-99ba53d9ee1e)
Pembuatan restoran baru dilanjutkan dengan menambahka menu, pertama admin akan diminta terlebih dahulu diminta memilih untuk menambahkan menu makanan atau minuman. Jika sudah selesai, admin dapat memilih selesai. Setelah memilih admin akan diminta untuk menginputkan nama makanan dan harga, nama minuman dan harga, lalu akan kembali ke menu penambahan menu hingga user memilih selesai.
![Screenshot 2024-05-03 085859](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/7af9e9ae-9eef-469b-b912-9b756f8a321a)

# Selesai Menambahkan
![Screenshot 2024-05-03 085910](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/a90a293d-6523-4b04-be28-53979dcb3b6f)
Setelah selesai menambahkan restoran admin dapat melanjutkan penambahan atau bisa berhenti melakukan penambahan

# Batal Menambahkan
![Screenshot 2024-05-03 100156](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/71fa36b2-7c8f-4d46-975f-06097946ac7a)
Bila admin belum menambahkan menu apapun dan memilih selesai, maka program akan memberikan pertanyaan seperti pada gambar di atas dan akan di bawah kembali ke menu admin

# Hapus Restoran
![Screenshot 2024-05-03 101319](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/a146324f-d7a9-4317-9608-0057c67e8b58)
![Screenshot 2024-05-03 101335](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/faccaafd-4230-4ea2-9c0b-c7ef929cfee5)
Admin dapat menghapus restoran dengan memberikan input id restoran pada gambar di atas, terlihat pada gambar di atas setelah admin menghapus restoran dan restoran tersebut sudah tidak terlihat

# Membuat Pesanan
![Screenshot 2024-05-03 090614](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/ba95bb06-2290-4475-9bcb-7066c923186c)
Customer dapat membuat pesanan baru, pertama user akan diminta untuk memilih restoran dengan menginputkan id restoran

# Pemilihan Menu
![Screenshot 2024-05-03 101735](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/8b523e90-3aa1-450f-94d4-ec92eb8980fc)
![Screenshot 2024-05-03 101741](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/5427e22a-8323-46f7-9f61-d365c2c6065f)
![Screenshot 2024-05-03 101835](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/79e1cbad-dec1-44f9-b3d4-919b7b429899)
![Screenshot 2024-05-03 101844](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/b3650843-d896-44b7-b8b7-969a7e0090a4)
![Screenshot 2024-05-03 101910](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/7e277602-c63c-440d-8ae8-c232d0fefd5d)
Setelah customer memilih restoran customer akan di berikann validasi apakah customer akan memesan di restoran tersebut atau tidak, customer dapat menambahkan makanan atau minuman dengan memasukan id yang tertera. Customer dapat menambahkan pesanan makanan atau minuman yang diinginkan. Setelah memesan customer akan diberikan pertanyaan kembali apakah mau menambahkan item kembali atau tidak, jika tidak maka customer akan dapat melihat detail pesanan pada gambar di bawah.

# Detail Pesanan
![Screenshot 2024-05-03 101918](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/bceb6037-7f3d-4828-a019-1052d7ea4ce2)
Gambar di atas merupakan detail dari pesanan yang telah di buat oleh customer.

# Riwayat Pesanan
![gambar](https://github.com/tridarma6/PBO-Tugas1/assets/146802115/de25fb09-d703-4a31-8a90-72b1579d2ca8)
Customer dapat melihat pesanan yang sebelumnya dilakukan dengan memilih pilihan 3






















