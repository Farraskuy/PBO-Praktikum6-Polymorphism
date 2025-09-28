# Praktikum PBO - Studi Kasus Polimorfisme

Repositori ini berisi serangkaian studi kasus dalam bahasa Java yang dirancang untuk mendemonstrasikan dan mempraktikkan konsep **Polimorfisme** dalam Pemrograman Berorientasi Objek (PBO). Proyek ini terbagi menjadi tiga kasus, masing-masing menyoroti aspek polimorfisme yang berbeda.

---

## Deskripsi Proyek

Tujuan utama dari proyek ini adalah untuk memahami bagaimana polimorfisme memungkinkan objek dari kelas yang berbeda untuk diperlakukan sebagai objek dari superclass atau interface yang sama. Ini memungkinkan penulisan kode yang lebih fleksibel, dapat digunakan kembali, dan mudah diperluas.

### **Studi Kasus 1: Another Type of Employee**

Kasus ini berfokus pada **polimorfisme melalui pewarisan (inheritance)**.

-   **Konsep:** Sebuah hierarki kelas karyawan dibuat, mulai dari `StaffMember` (abstrak) hingga jenis-jenis karyawan spesifik seperti `Executive`, `Hourly`, dan `Commission`.
-   **Implementasi:** Sebuah metode `payday()` dapat memproses array yang berisi berbagai jenis objek karyawan. Melalui *dynamic binding*, panggilan metode `pay()` akan secara otomatis menjalankan implementasi yang benar sesuai dengan tipe karyawan yang sebenarnya (misalnya, menghitung bonus untuk `Executive` atau komisi untuk `Commission`).

### **Studi Kasus 2: Painting Shapes**

Kasus ini juga mendemonstrasikan **polimorfisme melalui pewarisan** dalam konteks bentuk geometri.

-   **Konsep:** Sebuah kelas `abstract` `Shape` mendefinisikan "kontrak" bahwa semua bentuk harus memiliki metode `area()`. Kelas-kelas konkret seperti `Rectangle`, `Sphere`, dan `Cylinder` menyediakan implementasi `area()` mereka sendiri.
-   **Implementasi:** Sebuah kelas `Paint` memiliki metode `amount(Shape s)` yang dapat menerima objek bentuk apa pun. Metode ini secara polimorfik memanggil metode `s.area()` yang benar untuk menghitung jumlah cat yang dibutuhkan, tanpa perlu mengetahui jenis bentuk spesifik yang sedang diproses.

### **Studi Kasus 3: Polymorphic Sorting**

Kasus ini menyoroti **polimorfisme melalui interface**, khususnya `java.lang.Comparable`.

-   **Konsep:** Sebuah algoritma pengurutan tunggal (misalnya, `insertionSort`) dapat mengurutkan array dari tipe objek apa pun, selama objek tersebut mengimplementasikan interface `Comparable` dan mendefinisikan metode `compareTo`.
-   **Implementasi:** Kelas `Sorting` yang sama digunakan untuk mengurutkan array `Integer`, `String`, dan kelas kustom `Salesperson`. Ini menunjukkan kekuatan interface dalam mendefinisikan perilaku umum untuk kelas-kelas yang tidak berhubungan secara langsung dalam hierarki pewarisan.

---

## Cara Menjalankan

Setiap studi kasus (`Case1`, `Case2`, `Case3`) adalah proyek mandiri. Untuk menjalankan salah satu kasus:
1.  Buka proyek di IDE Java Anda (seperti IntelliJ IDEA, Eclipse, atau NetBeans).
2.  Temukan kelas yang berisi metode `main()`:
    -   **Case 1:** `Firm.java`
    -   **Case 2:** `PaintThinks.java`
    -   **Case 3:** `Numbers.java`, `Strings.java`, atau `WeeklySales.java`
3.  Kompilasi dan jalankan file tersebut. Program akan mencetak output yang relevan ke konsol.
EOF
