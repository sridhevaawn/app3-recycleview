Project RecyclerView
Ini adalah proyek sederhana untuk belajar RecyclerView menggunakan Git & Android Studio

👥 Tim
Salsa Billa Brilliana
Sri Dheva A.W.N
Meriani Putri Suryaningtiyas

📱 Fitur
Menampilkan crud

🔧 Teknologi
Kotlin
Android Studio
Git + GitHub

📸 Penjelasan code penting
> StudentAdapter.kt
  kelas adapter untuk RecyclerView aplikasi Android menampilkan daftar siswa menggunakan layout item_student. Adapter ini menerima Context dan daftar siswa (studentList) lalu menyimpan salinan daftar tersebut dalam filteredList untuk mendukung fitur pencarian (filtering). Setiap item siswa ditampilkan melalui ViewHolder dengan TextView untuk nama, NIS, dan kelas, serta dua tombol: edit dan hapus. Tombol edit menampilkan dialog isian (dialog_edit_student) yang memungkinkan pengguna mengubah data siswa, sedangkan tombol hapus menampilkan dialog konfirmasi sebelum menghapus siswa dari daftar. Adapter juga mendukung filter (pencarian) berdasarkan nama, NIS, atau kelas menggunakan getFilter(). Perubahan data akan diperbarui di tampilan melalui notifyItemChanged, notifyItemRemoved, atau notifyDataSetChanged agar tampilan RecyclerView tetap sinkron dengan data.

> Student.kt
  ini mendefinisikan sebuah data class bernama Student di dalam paket com.smkth.app3_recycleview.model, yang digunakan untuk merepresentasikan data siswa. Kelas ini memiliki tiga properti yaitu nama, nis, dan kelas, semuanya bertipe String. Kelas ini digunakan sebagai model data dalam aplikasi yang menampilkan daftar siswa menggunakan RecyclerView.

> DummyData.kt
  ini berfungsi sebagai penyedia data contoh (dummy) untuk aplikasi. Objek ini memiliki satu fungsi getStudentList() yang mengembalikan daftar (List) berisi 10 objek Student, masing-masing berisi data siswa seperti nama, nis, dan kelas. Fungsi ini biasa digunakan untuk pengujian atau tampilan awal aplikasi sebelum data asli dimasukkan, dan sangat membantu dalam pengembangan antarmuka pengguna yang membutuhkan data list untuk ditampilkan pada komponen seperti RecyclerView.

> DetailActivity.kt
  DetailActivity pada aplikasi Android ini bertugas menampilkan detail data siswa. Aktivitas ini menggunakan layout activity_detail.xml, dan memiliki tiga TextView yaitu tvNama, tvNis, dan tvKelas untuk menampilkan nama, NIS, dan kelas siswa. Pada metode onCreate(), aktivitas diinisialisasi dan setContentView() digunakan untuk menetapkan tampilan layout. Kemudian, ViewCompat.setOnApplyWindowInsetsListener digunakan untuk mengatur padding tampilan utama agar tidak tertutup oleh elemen sistem seperti status bar. Setelah itu, data siswa diambil dari Intent menggunakan key "student_nama", "student_nis", dan "student_kelas", yang sebelumnya dikirim dari aktivitas lain, lalu ditampilkan pada masing-masing TextView untuk memperlihatkan informasi detail siswa kepada pengguna.

> Drawable
  Folder drawable berfungsi sebagai tempat penyimpanan seperti gambar yang akan digunakan dalam antarmuka aplikasi. Gambar-gambar ini bisa ditampilkan di layout XML menggunakan atribut android:src="@drawable/namagambar" atau melalui kode Kotlin menggunakan setImageResource(R.drawable.namagambar) pada komponen ImageView. 

> activity_detail.xml
  DetailActivity pada aplikasi Android ini menggunakan LinearLayout dengan orientasi vertikal dan padding 20dp. Layout ini untuk menampilkan detail biodata siswa, dimulai dengan judul TextView berisi teks "Biodata Siswa" yang berada di tengah dan berukuran besar (40sp), diikuti oleh ImageView yang menampilkan gambar fotosiswa.jpg dari folder drawable sebagai ikon siswa. Di bawahnya terdapat tiga TextView dengan ID tvNama, tvNis, dan tvKelas yang masing-masing digunakan untuk menampilkan nama, NIS, dan kelas siswa. 

> activity_main.xml
  MainActivity dalam aplikasi Android ini menggunakan ConstraintLayout sebagai root layout. Di dalamnya terdapat tiga komponen utama: tombol Button dengan ID btnTambah untuk menambah data siswa, SearchView dengan ID searchView untuk mencari siswa berdasarkan kata kunci, dan RecyclerView dengan ID recyclerView untuk menampilkan daftar siswa secara scrollable. Tombol berada di bagian atas, SearchView di bawah tombol, dan RecyclerView mengisi sisa layar di bawahnya. Setiap komponen diposisikan menggunakan constraint (app:layout_constraint...) agar tampilan responsif dan mengikuti posisi relatif antar elemen di berbagai ukuran layar. 

> dialog_edit_student.xml
  ini dirancang untuk menampilkan tiga input form berupa EditText guna mengisi data siswa. Ketiga EditText tersebut memiliki ID masing-masing: edtNama untuk mengisi nama siswa dengan tipe input teks nama, edtNis untuk mengisi NIS dengan tipe input angka, dan edtKelas untuk mengisi kelas siswa dengan tipe input teks. Setiap input memiliki ukuran lebar tetap 385dp dan tinggi berbeda sesuai kebutuhan. 

> item_student.xml
  ini mendeskripsikan sebuah tampilan kartu (CardView) untuk menampilkan informasi siswa dalam aplikasi Android. Di dalam kartu tersebut terdapat LinearLayout vertikal yang membungkus dua bagian utama yitu bagian data siswa dan tombol aksi. Bagian data siswa terdiri dari sebuah gambar ikon (ImageView) berukuran 48dp yang menggambarkan siswa, dan di sebelahnya ada tiga TextView yang menampilkan nama siswa, nomor induk siswa (NIS), dan kelas dengan gaya teks dan warna berbeda. Di bawah bagian data, ada baris tombol horizontal yang berisi dua tombol tombol "Edit" dan tombol "Hapus", yang masing-masing berfungsi untuk mengubah atau menghapus data siswa, dan tombol-tombol ini rata ke kanan.

📸 Screenshot
![WhatsApp Image 2025-08-07 at 13 17 30_b79c201d](https://github.com/user-attachments/assets/d01edb39-17ea-4f6b-9420-88f101a77bfe)
![WhatsApp Image 2025-08-07 at 13 17 30_fc098a82](https://github.com/user-attachments/assets/e7f41670-e255-466a-b447-8507ebcb13e1)
![WhatsApp Image 2025-08-07 at 13 17 30_723c539f](https://github.com/user-attachments/assets/e41fa027-bb08-4d41-8d7a-d3101bd703eb)
![WhatsApp Image 2025-08-07 at 13 17 31_8d28944e](https://github.com/user-attachments/assets/e7d783ed-973e-4115-a189-a18f447e9cda)






