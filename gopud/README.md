# Tutorial APAP
## Authors
* **Azzahra Putri Ramadhanty** - *1706025125* - *B*

---
## Tutorial 4
### What I have learned today
1.
Jelaskan yang anda pelajari dari melakukan latihan nomor 2, dan jelaskan tahapan bagaimana anda menyelesaikan latihan nomor 2.
Dari latihan nomor 2 saya jadi dapat menemukan cara yang lebih efektif dalam memodifikasi atau membuat dynamic navbar.
Dalam menyelesaikan latihan nomor 2, pertama-tama saya mengubah fragment.html dengan menambahkan (title) setelah fragment navbar -> <nav th:fragment="navbar(title)"...> dan mendefine title pada link navbar title -> <nav th:text="${title}"...> Setelah itu, pada setiap page, saya mendefine title dari masing-masing page pada fragment navbar -> <nav th:replace="fragments/fragment :: navbar(title = 'Home')">

2. Jelaskan yang anda pelajari dari latihan nomor 3, dan jelaskan tahapan bagaimana anda menyelesaikan latihan nomor 3.
Saya belajar dari latihan nomor 3 bahwa kita dapat menggunakan method di controller pada html dengan memanfaatkan params.
Dalam menyelesaikan nomor 3, saya membuat fields untuk input menu baru dengan atribut-atribut yang ditentukan. Lalu, saya membuat method addrow, removerow, addmenuformpage, dan addmenusubmit untuk melakukan operasi pada view. Setelah itu, saya menambahkan iterasi untuk dapat menambahkan banyak menu sekaligus (karena sebelumnya saya tidak dapat melakukan hal tersebut)


3. Jelaskan perbedaan th:include dan th:replace.
 Thymeleaf dapat memasukkan bagian dari halaman lain sebagai fragment menggunakan th: include atau th: replace. th:include akan memasukkan konten fragmen ke dalam tag hostnya. Sedangkan th:replace akan menggantikan tag host dengan fragmen. Contohnya: Contohnya 
 <div th:include="..."> content </div> : fragmen diletakkan dalam div tag
 <div th:replace="..."> content </div> : div akan digantikan dengan fragmen. 

 4. Jelaskan bagaimana penggunaan th:object beserta tujuannya
 th:object digunakan untuk menghandle input dari user. th: objek bermanfaat untuk menentukan objek yang terikat dengan data dari formulir (input) yang disubmit.

## Tutorial 3
### What I have learned today

1. Pada class MenuDb, terdapat method findByRestoranIdRestoran, apakah kegunaan dari
method tersebut?
method findByRestoranIdRestoran digunakan untuk mencari menu pada restoran yang memiliki idRestoran yang diberikan. method ini akan mengembalikan list menu yang ada pada restoran yang dimaksud.

2. Pada class RestoranController, jelaskan perbedaan method addRestoranFormPage dan
addRestoranSubmit?
addRestoranFormPage adalah method yang mengatur kerja dan mengembalikan tampilan dari form untuk fitur tambah restoran. sedangkan addRestoranSubmit adalah method yang akan menghandle data yang dimasukan/disubmit melalui form. addRestoranSubmit nantinya akan mengambil dan menyimpan data yang dimasukan melalui form ke database.

3. Jelaskan apa kegunaan dari JPA Repository?
JPA atau Java Persistence API sendiri adalah sebuah standar spesifikasi tentang bagaimana cara mengakses atau memasukan objek-objek Java ke suatu database. Ada dua bagian pada JPA yaitu *mapping subsystem* untuk melakukan
*mapping* antara class-class ke *relational table* dan ebuah API *EntityManager*
untuk mengakses objek-objek, mengatur query, dsb. Ada juga istilah Hibernate yang merupakan implementasi dari JPA. JPA menggunakan teknologi ORM atau Object Relational Mapping, yang diimplementasikan oleh framework Hibernate.

4. Sebutkan dan jelaskan di bagian kode mana sebuah relasi antara RestoranModel dan
MenuModel dibuat?
relasi antara keduanya terdefinisikan melalui @OneToMany pada RestoranModel yang menunjukan bahwa satu restoran dapat memiliki banyak menu dan @ManyToOne pada MenuModel yang menunjukan bahwa banyak menu dapat dimiliki oleh satu restoran.

5. Jelaskan kegunaan FetchType.LAZY, CascadeType.ALL, dan FetchType.EAGER
FetchType.LAZY: memberi tahu Hibernate untuk mengambil suatu entity dari database saat dibutuhkan saja.
FetchType.EAGER: memberi tahu Hibernate untuk mengambil suatu entity diawal sehingga elemennya sudah siap saat kita membutuhkannya disuatu waktu.
CascadeType.ALL: digunakan agar segala perubahan yang terjadi pada suatu entity (seperti DELETE, UPDATE, dsb) akan terjadi juga pada entity lain yang memiliki relasi dengannya. Contohnya ketika kita menghapus suatu restoran, maka menu yang dimiliki restoran tersebut juga akan ikut terhapus.

## Tutorial 2
### What I have learned today
#### Github
1. Cobalah untuk menambahkan sebuah restoran dengan mengakses ​link berikut: http://localhost:8080/restoran/add?idRestoran=1&nama=PanyuFC&alamat=Kantin%20Fasilkom&nomorTelepon=14022
Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi.
Page yang dihasilkan akan menunjukan white label error karena controller belum me-return view template (HTML file) add-restoran

2. Cobalah untuk menambahkan sebuah restoran dengan mengakses ​link berikut: http://localhost:8080/restoran/add?idRestoran=2&nama=KentukuFC&alamat=Kantin%20FIK
Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi.
Akan terjadi error karena tidak ada parameter nomorTelepon pada URL yang dimasukan. Sedangkan, pada requestparam kita diwajibkan (required = true) untuk menyertakan nomorTelepon sebagai parameter pada URL.

3. Jika Papa APAP ingin melihat restoran PanyuFC​, link ​apa yang harus diakses?
http://localhost:8080/restoran/view?idRestoran=1

4. Tambahkan 1 contoh restoran lainnya sesukamu. Lalu cobalah untuk mengakses ​http://localhost:8080/restoran/viewall​, apa yang akan ditampilkan? Sertakan juga bukti ​screenshotmu.
![image](https://user-images.githubusercontent.com/36152954/65163707-9d78c300-da65-11e9-8d49-55babfc6c206.png)
