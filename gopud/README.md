# Tutorial APAP
## Authors
* **Azzahra Putri Ramadhanty** - *1706025125* - *B*

## Tutorial 9
### What I have learned today
### Latihan

1. Ceritakan langkah - langkah yang kalian lakukan untuk solve LATIHAN no.1, dan mengapa kalian melakukan langkah - langkah tersebut?  
Dalam mengerjakan soal LATIHAN 1, saya menambahkan this.setSate ({nama: "", alamat:"", nomorTelepon:"", rating:""});  pada bagian akhir addRestoran. Tujuannya adalah agar saat form selesai disubmit/dipost, value pada form akan diganti menjadi string kosong jadi form tidak akan terisi oleh informasi restoran yang disubmit sebelumnya.

2. Jelaskan fungsi dari async dan await! 

- Async digunakan untuk mengatasi asynchronous pada javascript.  
- Await digunakan untuk menunggu eksekusi sampai proses asynchronous selesai kemudian baru melanjutkan ke baris selanjutnya.
 Async digunakan sebelum fungsi dan tidak harus ada wait sedangkan await harus menggunakan async.

3.  Masukkan jawaban dari TODO (Screenshot) pada Component Lifecycle pada pertanyaan ini
        ![1](https://user-images.githubusercontent.com/36152954/69876417-1ad87380-12f2-11ea-92c4-26c26f2d8160.png)
        ![2](https://user-images.githubusercontent.com/36152954/69876440-32176100-12f2-11ea-9b08-dcdedbdb3086.png)
        ![3](https://user-images.githubusercontent.com/36152954/69876479-46f3f480-12f2-11ea-8138-a88a85e88e3f.png)
        ![4](https://user-images.githubusercontent.com/36152954/69876507-5a06c480-12f2-11ea-8a91-a7e953aa3e02.png)

4. Jelaskan fungsi dari componentDidMount, shouldComponentUpdate, componentDidUpdate, componentWillReceiveProps, componentWillUnmount. Notes : Penjelasan harus mencantumkan “kapan fungsi dipanggil” dan “use case apa saja yang biasanya menggunakan lifecycle method tersebut”. 
- componentDidMount() : tahap setelah component di render. pada tahap ini proses pemanggilan ajax dan perubahan isi state setelah proses ajax di panggil.
 - shouldComponentUpdate : tugasnya adalah untuk menentukan apakah sebuah component akan di render ulang atau tidak. Method ini akan mengembalikan nilai boolean true & false, jika true maka component akan di render ulang atau sebaliknya. 
- componentDidUpdate : fungsinya sama dengan componentDidMount yaitu untuk manipulasi DOM dan request data.
 - componentWillReceiveProps : fungsi ini akan di eksekusi bila state yang ada di component akan di update atau di ubah dengan nilai props yang baru. 
- componentWillUnmount: fungsi ini dipanggil ketika komponen sudah dibuang dari DOM. Fungsi ini digunakan ketika aksi-aksi yang berhubungan dengan pembersihan diperlukan. Use case  nya adalah ketika membuang timer yang sebelumnya didefinisikan di componentDidMount. 


## Tutorial 8
### What I have learned today
### Latihan
1. Saya membuat variable checkbox untuk setiap item pada item.js. Lalu dilakukan pengecekan pada setiap item apakah checkbox terisi (checked) atau tidak. Jika terisi, maka checkbox akan ditampilkan yaitu pada My Favorite dimana checkbox bernilai true. Sedangkan checkbox bernilai false di Our Menu sehingga tidak ditampilkan.

![img](https://user-images.githubusercontent.com/36152954/68775129-9edafc00-0660-11ea-9f89-7e815bd55ed0.png)

screenshot diatas juga termasuk untuk latihan nomor 2 yaitu implementasi function handleItemClick


2. Saya membuat dua function untuk handleItemClick yaitu handleItemClick1 yang hanya dapat melakukan add serta diimplementasikan pada Our Menu dan handleItemClick2 yang dapat diadd dan remove untuk diimplementasikan pada My Favorite. handleItemClick1 memiliki function .splice yang mereturn array yang sudah di remove sedangkan handleItemClick2 tidak memiliki function .splice sehingga Our Menu hanya dapat melakukan add.

![img](https://user-images.githubusercontent.com/36152954/68775071-8a96ff00-0660-11ea-98f0-a57c2ce59e93.png)

3. Dalam membuat toggle untuk menampilkan My Favorite, saya membuat state yaitu newState di App.js yang memiliki default false. State ini akan berubah setiap kali toggle diklik yang ditrigger melalui function showFavorit. Apabila state bernilai true maka My Favorite akan ditampilkan, begitu pula sebaliknya

![img](https://user-images.githubusercontent.com/36152954/68776278-69371280-0662-11ea-9e37-33152fcfdafd.png)
![img](https://user-images.githubusercontent.com/36152954/68776305-73f1a780-0662-11ea-9164-63f493a0db27.png)

4. Saya membuat EmptyState pada components untuk menampilkan statement bahwa My Favorite belum diisi. EmptyState ini diakses/diimport oleh List.js yang melakukan pengecekan apabila list items tidak ada, maka akan ditampilkan EmptyState tersebut. Sedangkan jika list items ada maka akan ditampilkan favorite items.

![img](https://user-images.githubusercontent.com/36152954/68776929-6f79be80-0663-11ea-8ff9-56abce52ad07.png)
---
## Tutorial 7
### What I have learned today
###Latihan


1. Jelaskan secara singkat perbedaan Otentikasi dan Otorisasi! Di bagian mana (dalam kode
yang telah anda buat) konsep tersebut diimplementasi?

- Perbedaan utama antara otentikasi dan otorisasi adalah bahwa otentikasi adalah proses memeriksa detail pengguna untuk mengidentifikasinya dan memberikan akses ke sistem sementara otorisasi adalah proses memeriksa hak atau izin pengguna yang diotentikasi untuk mengakses sumber daya sistem.


2. Apa itu BCryptPasswordEncoder? Jelaskan secara singkat cara kerjanya!

- BCryptPasswordEncoder adalah fungsi pada spring untuk melakukan hashing password. BCryptPasswordEncoder secara otomatis menghitung dan menghasilkan hash secara acak dan setiap kali di call, kita akan mendapat hasil hash yang berbeda-beda.


3. Jelaskan secara singkat apa itu UUID dan mengapa kita memakai UUID di UserModel.java?

- UUID (Universally Unique Identifier) adalah kumpulan 36 karakter (string) yang dibuat secara acak (random) dan unik dengan teknik khusus. UUID terdiri dari 32 karakter alphanumerik dan 4 karakter tanda hubung (strip). 
Dikarenakan karakter UUID yang unik, sangat kecil kemungkinan sebuah karakter UUID akan sama bahkan jika di-generate dalam tempo 1 detik sekalipun. UUID umumnya digunakan sebagai Primary Key, termasuk pada UserModel. UUID digunakan
untuk menghindari konflik primary key dan juga untuk mengamankan data.

  
4. Apa kegunaan class UserDetailsServiceImpl.java? Mengapa harus ada class tersebut
padahal kita sudah memiliki class UserRoleServiceImpl.java?

- UserServiceImpl ada pada package service, sementara UserDetailServiceImpl pada package security.
Service ini melakuakn import dari org.springframework.security.core.userdetails.UserDetailsService yang berisi antarmuka inti yang memuat data khusus
pengguna


## Tutorial 6
### What I have learned today
###Latihan
1. Apa itu postman? Apa kegunaan dari postman?

- POSTMAN adalah sebuah aplikasi (berupa plugin) untuk browser chrome, fungsinya adalah sebagai REST Client atau istilahnya adalah aplikasi yang digunakan untuk melakukan uji coba REST API yang telah kita buat.


2. Apa kegunaan dari annotation @JsonIgnoreProperties?

- Anotasi yang dapat digunakan untuk menekan serialisasi properti (selama serialisasi), atau mengabaikan pemrosesan properti JSON yang dibaca (saat deserialisasi).

3. Apa itu ResponseEntity dan apa kegunaannya?

- ResponseEntity dimaksudkan untuk mewakili seluruh respons HTTP. ResponseEntity dapat mengontrol apa pun yang masuk ke dalamnya: kode status, header, dan tubuh. 



## Tutorial 5
### What I have learned today
###Latihan
1. Before & after MenuServiceImpl
![image](https://user-images.githubusercontent.com/36152954/66542011-7c365e80-eb5b-11e9-833c-a71dd1181949.png)
![image](https://user-images.githubusercontent.com/36152954/66541958-55782800-eb5b-11e9-95ff-94b11043a850.png)

2. After RestoranControllerTest
(lupa screenshot)
![iamge](https://user-images.githubusercontent.com/36152954/66546528-69298b80-eb67-11e9-9c93-43256222d3f0.png)

3. After exclude main
(lupa screenshot)
![image](https://user-images.githubusercontent.com/36152954/66546646-a4c45580-eb67-11e9-9a42-cc31cfe2b552.png)
  
###Pertanyaan
1. Jelaskan bagian mana saja dari test yang dibuat pada latihan no 2 adalah ​given, when, ​dan ​and then.
given merupakan inisiasi dari dummy, mengatur attribut-attribut dari dummy tersebut, dan mengatur return dari database
ketika menggunakan service. Bagian when berupa pemanggilan mockMvc.perform(get("/store/view?idStore=1")) yang akan 
langsung berinteraksi dengan controller dan mengembalikan halaman berdasarkan controller. Bagian and then berupa 
pemanggilan method .andExpect(...) yang berfungsi untuk melakukan pengecekan interaksi sesuai dengan yang diharapkan.

2. Jelaskan perbedaan ​line coverage ​dan ​logic coverage.
Line coverage mengukur berapa banyak statement yang ada. Statement adalah line of code, tidak termasuk comment, coditionals, etc.
Logic coverage mengukur internal structure dari statement, meliputi decision yang ada dalam program, requirement, etc.

3. Pada keadaan ideal, apa yang seharusnya dibuat terlebih dahulu, ​code ​atau ​unit test​? Mengapa
seperti itu? Apa akibatnya jika urutannya dibalik, adakah risiko tak terlihat yang mungkin
terjadi?
Ketika membuat test terlebih dahulu, akan jauh lebih mudah dan cepat untuk membuat code. 
Membuat unit test membantu untuk mempertimbangkan apa yang perlu dilakukan. 
Requirement dibuat berdasarkan unit test sehingga tidak ada kesalahpahaman spesifikasi pada code yang akan dibuat.
Error yang terjadi pada unit test mudah ditemukan dan relatif mudah diperbaiki.
Jika urutan dibalik, yaitu membuat code terlebih dahulu lalu membuat unit test, akan muncul beberapa resiko diantaranya:
    - Over-engineering : setelah menuliskan test, kita baru sadar kalau implementasi yang kita tulis lebih kompleks dari yang seharusnya.
    - Kode yang kita tulis sulit untuk di tes, membuat kita harus menyesuaikan kode yang telah kita buat agar dapat di tes oleh automated test.
    - No Test at All : Kita jadi malas untuk menulis automated test karena implementasi production code sudah selesai dan sudah berjalan dengan baik.

4. [Bonus] ​Jelaskan mengapa pada latihan no 3, ​main class s​pring tidak diikutsertakan ke dalam
perhitungan coverage? Apa saja yang dapat menyebabkan suatu ​class d​apat di-​exclude d​ari perhitungan ​code coverage.
Karena class spring adalah main class method yang tidak dibutuhkan dalam penghitungan coverage.
Hal-hal yang dapat menyebabkan di exclude antara lain file built-in, 
file yang mempunyai code coverage rendah dan akan menimbukan kerusakan coverage secara keseluruhan serta 
file configurasi yang tidak terdapat bisnis proses didalamnya.

---
## Tutorial 4
### What I have learned today
1. Jelaskan yang anda pelajari dari melakukan latihan nomor 2, dan jelaskan tahapan bagaimana anda menyelesaikan latihan nomor 2.

Dari latihan nomor 2 saya jadi dapat menemukan cara yang lebih efektif dalam memodifikasi atau membuat dynamic navbar.
Dalam menyelesaikan latihan nomor 2, pertama-tama saya mengubah fragment.html dengan menambahkan (title) setelah fragment navbar -> <nav th:fragment="navbar(title)"...> dan mendefine title pada link navbar title -> <nav th:text="${title}"...> Setelah itu, pada setiap page, saya mendefine title dari masing-masing page pada fragment navbar -> <nav th:replace="fragments/fragment :: navbar(title = 'Home')">

2. Jelaskan yang anda pelajari dari latihan nomor 3, dan jelaskan tahapan bagaimana anda menyelesaikan latihan nomor 3.

Saya belajar dari latihan nomor 3 bahwa kita dapat menggunakan method di controller pada html dengan memanfaatkan params.
Dalam menyelesaikan nomor 3, saya membuat fields untuk input menu baru dengan atribut-atribut yang ditentukan. Lalu, saya membuat method addrow, removerow, addmenuformpage, dan addmenusubmit untuk melakukan operasi pada view. Setelah itu, saya menambahkan iterasi untuk dapat menambahkan banyak menu sekaligus (karena sebelumnya saya tidak dapat melakukan hal tersebut)


3. Jelaskan perbedaan th:include dan th:replace.

Thymeleaf dapat memasukkan bagian dari halaman lain sebagai fragment menggunakan th: include atau th: replace. th:include akan memasukkan konten fragmen ke dalam tag hostnya. Sedangkan th:replace akan menggantikan tag host dengan fragmen. Contohnya: Contohnya

 <div th:include="..."> content <//div> : fragmen diletakkan dalam div tag

 <div th:replace="..."> content <//div> : div akan digantikan dengan fragmen. 


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

---
## Tutorial 1
### What I have learned today
#### Github
1. Apa itu Issue Tracker? Masalah apa yang dapat diselesaikan dengan Issue Tracker?
​Dengan Issue Tracker, kita dapat mengumpulkan feedback dari user, melaporkan ada atau tidaknya bug pada software, dan meng-organize tasks yang ingin diselesaikan menggunakan issue pada repository. Issue Tracker dapat membantu kita melakukan:
- track dan prioritize tasks dengan project boards
- menyelesaikan issue dengan pull request (merge), dll.
2. Apa perbedaan dari git merge dan merge --squash?
Merge adalah suatu command dalam git untuk membuat branch yang bercabang menjadi satu kembali atau dengan kata lain mengintegrasikan kembali branch tersebut menjadi satu.
Bedanya, jika kita menggunakan merge --squash, riwayat atau history dari feature branch akan dihapus dan tidak ikut tertulis di master branch.

#### Spring
3. Apa itu library & dependency?
Library adalah sekumpulan kelas dan fungsi yang dibuat untuk membantu pengembang aplikasi untuk dapat membangun aplikasi dengan lebih cepat dan lebih efisien. Pada umumnya saat kita membuat aplikasi web ada beberapa kelas yang hampir selalu digunakan, sehingga kelas-kelas tersebut dapat di atur supaya secara otomatis di-load oleh system dan dapat langsung digunakan.
Spring menerapkan konsep Dependency Injection atau biasa dikenal dengan DI. DI dimaksudkan agar suatu kelas tidak terikat erat dengan kelas yang lain sehingga hubungan antar bagian kode menjadi longgar (loosely coupled). Diartikan simplenya bahwa DI berarti kita memberikan/menginjeksi suatu kelas ke kelas yang lain yang merupakan dependensinya (membutuhkannya).
4. Apa itu Maven? Mengapa kita perlu menggunakan Maven? 
Maven adalah Java Build Tools untuk membuat project di Java. Maven menggunakan konsep Project Object Model (POM). POM tersebut berisi informasi dan konfigurasi yang digunakan Maven untuk membuat project. Kita perlu menggunakan Maven untuk dapat menggabungkan project yang dikerjakan oleh banyak programmer yang menggunakan IDE berbeda-beda karena Maven mendefinisikan projectnya sendiri. Selain itu, Maven juga dapat memanage Dependency dengan mudah.
5. Apa alternatif dari Maven?
Salah satu alternatif dari Maven adalah Ant yang dikembangkan dengan developer yang sama yaitu Apache Software Foundation dan sama-sama menggunakan XML file format. Fitur-fitur Ant ada pada Maven bahkan Maven bisa diintegrasikan dengan Ant via Maven plugin. Perbedaannya yaitu Maven mempunyai tujuan yang lebih luas daripada Ant yang hanya fokus untuk build tool dan membuat task-task tertentu saja. 

### What I did not understand
(tuliskan apa saja yang kurang Anda mengerti, Anda dapat men-_check_ apabila Anda sudah mengerti dikemudian hari, dan tambahkan tulisan yang membuat Anda mengerti)
- [ ] Kenapa saya harus belajar APAP? - [x] Kenapa?
Karena ...
