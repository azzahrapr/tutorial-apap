# Tutorial APAP
## Authors
* **Azzahra Putri Ramadhanty** - *1706025125* - *B*

---
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

### What I did not understand
(tuliskan apa saja yang kurang Anda mengerti, Anda dapat men-_check_ apabila Anda sudah mengerti dikemudian hari, dan tambahkan tulisan yang membuat Anda mengerti)
- [ ] Kenapa saya harus belajar APAP? - [x] Kenapa?
Karena ...