## Tutorial 8
### What I have learned today
### Latihan
1. Saya membuat variable checkbox untuk setiap item pada item.js. Lalu dilakukan pengecekan pada setiap item apakah checkbox terisi (checked) atau tidak. Jika terisi, maka checkbox akan ditampilkan yaitu pada My Favorite dimana checkbox bernilai true. Sedangkan checkbox bernilai false di Our Menu sehingga tidak ditampilkan.

![img](https://user-images.githubusercontent.com/36152954/68775129-9edafc00-0660-11ea-9f89-7e815bd55ed0.png)

screenshot diatas juga termasuk untuk latihan nomor 2 yaitu implementasi function handleItemClick


2. Saya membuat dua function untuk handleItemClick yaitu handleItemClick1 yang hanya dapat melakukan add serta diimplementasikan pada Our Menu dan handleItemClick2 yang dapat diadd dan remove untuk diimplementasikan pada My Favorite. handleItemClick1 memiliki function .splice yang mereturn array yang sudah di remove sedangkan handleItemClick2 tidak memiliki function .splice sehingga Our Menu hanya dapat melakukan add.

![img](https://user-images.githubusercontent.com/36152954/68775071-8a96ff00-0660-11ea-98f0-a57c2ce59e93.png)

3. Dalam membuat toggle untuk menampilkan My Favorite, saya membuat state yaitu newState di App.js yang memiliki default false. State ini akan berubah setiap kali toggle diklik yang ditrigger melalui function showFavorit. Apabila state bernilai true maka My Favorite akan ditampilkan, begitu pula sebaliknya. Untuk menampilkan dan menghilangkan My Favorite, cek newState dilakukan pada div class My Favorite (lihat screenshot latihan nomor 1)

![img](https://user-images.githubusercontent.com/36152954/68776278-69371280-0662-11ea-9e37-33152fcfdafd.png)
![img](https://user-images.githubusercontent.com/36152954/68776305-73f1a780-0662-11ea-9164-63f493a0db27.png)

4. Saya membuat EmptyState pada components untuk menampilkan statement bahwa My Favorite belum diisi. EmptyState ini diakses/diimport oleh List.js yang melakukan pengecekan apabila list items tidak ada, maka akan ditampilkan EmptyState tersebut. Sedangkan jika list items ada maka akan ditampilkan favorite items.

![img](https://user-images.githubusercontent.com/36152954/68776929-6f79be80-0663-11ea-8ff9-56abce52ad07.png)
