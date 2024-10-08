# latihan-1

## * Apa yang harus didefinisikan sebeum membuat objek?
<p>Sebelum membuat objek kita harus membuat class terlebih dahulu. 
Di dalam class, kita mendefinisikan atribut (variabel) dan metode (fungsi) yang menjelaskan perilaku atau tindakan yang dapat dilakukan oleh objek tersebut</p>

## * Buatlah gambar diagram class dan dua buah objek dari class Person bernama Antor dan Riko
![Screenshot 2024-10-07 215331](https://github.com/user-attachments/assets/6fe14aae-2fa4-4c6b-ba31-688143043ee3)
<p>Dari diagram tersebut objek anton dan riko belum ditambahkan. </p>

## Berikut diagram class yang telah dimasukan dua objek
<p>* diagram objek untuk Anton</p>

| Anton : Person |
|----------------|
| Nama : Anton   |
| Jenis Kelamin : L |
| Umur : 25      |
<p>Objek  anton adalah instance dari class Person, yang dimana atribut seperti nama, jenis kelamin, dan umur di isi biodata Anton </p>

<p> * diagram objek untuk Riko</p>

| Riko : Person |
| --------------|
| Nama : Riko   |
| Jenis Kelamin : L |
| Umur : 35     |
<p>Objek Riko adalah instance dari class Person, yang dimana atribut seperti nama, jenis kelamin, dan umur di isi biodata Riko</p>
<p> * Diagram diatas menjelaskan bahwa Anton dan Riko merupakan objek atau instance dari class Person </p>

## * Buatlah gambar diagram objek AkunBank dengan instance method simpanUang, ambilUang dan cekSaldo
![Screenshot 2024-10-07 215439](https://github.com/user-attachments/assets/608bb855-13d3-4dfb-8b2d-51d574829f7d)
<p>Diagram diatas merupakan diagram class Akun Bank, tetapi belum terdapat objek yang dimasukkan.</p>
<p>* Berikut adalah diagram objek dari Akun Bank</p>

| akunBank : AkunBank |
| ---------------------|
| Saldo : 100000       | 
| simpanUang(500000)   |
| ambilUang(150000)    |
| cekSaldo()           |
<p> Objek 'akunBank' merupakan instance dari class AkunBank</p>
<p>* Atribut `saldo` diisi dengan nilai awal yaitu 100000</p>
<p>* Metode `simpanUang(500000)` untuk menambahkan uang ke saldo</p>
<p>* Metode `ambilUang(150000)` untuk mengurangi saldo</p>
<p>* Metode `cekSaldo()` untuk menampilkan sisa saldo</p>

<p>Dari diagram tersebut kita dapat menunjukan bagaimana objek tersebut beroperasi berdasarkan metode yang dipanggil dan bagaimana nilai atribut `saldo` berubah</p>

## latihan-2
<p>Buatlah kode program java untuk:</p>
<p>• Mendeklarasikan class Person, dengan atribut Nama,
JenisKelamin, Umur </p>
<p>• Buatlah dua buah objek dari class Person bernama Anton
dan Riko </p>

## INPUT

``` Java
package person;

public class Person {
    // Deklarasi atribut
    String nama;
    String jenisKelamin;
    int umur;

    // Constructor untuk menginisialisasi atribut
    public Person(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    // Getter dan Setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk atribut jenisKelamin
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    // Getter dan Setter untuk atribut umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method untuk menampilkan informasi tentang person
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur: " + umur);
    }
    
    public static void main(String[] args) {
        // Membuat objek Person bernama Antor dan Riko
        Person antor = new Person("Anton", "Laki-laki", 25);
        Person riko = new Person("Riko", "Laki-laki", 35);

        // Menampilkan informasi untuk Antor
        System.out.println("Informasi Anton:");
        antor.tampilkanInfo();

        // Menampilkan informasi untuk Riko
        System.out.println("\nInformasi Riko:");
        riko.tampilkanInfo();
    }
}
    
   ```
## OUTPUT
![Screenshot 2024-10-07 210609](https://github.com/user-attachments/assets/ce6d21c1-567d-44ad-bd56-6e176580c3fa)

<p>* Kelas `Person` untuk mendeklarasikan atribut nama, jenis kelamin, dan umur</p>
<p>* construktor digunakan untuk menginisialisasikan atribut saat objek dibuat</p>
<P>* Dua objek yaitu `Anton` dan `Riko` dibuat menggunakan construktor dan datanya di isi</P>
<p>* Pada Metode `tampilkanInfo` digunakan untuk menampilkan dua objek tersebut yaitu Anton dan Riko</p>

## Latihan-3
<p>Buatlah kode java untuk:</p>
<p>• Mendeklarasikan class AkunBank dengan instance method
simpanUang, ambilUang dan cekSaldo</p>
<p>• Buat objek AkunBank dan tetapkan nilai saldo awal Rp. 100000,
kemudian panggil 3 method tersebut dan tampilkan proses berikut</p>

![Screenshot 2024-10-08 204201](https://github.com/user-attachments/assets/e6c3642c-601c-4628-af89-124d16849df3)

## INPUT

``` Java
package akunbank;

// Mendeklarasikan class AkunBank
public class AkunBank {
    // Atribut untuk menyimpan saldo
    private int saldo;

    // Constructor untuk menginisialisasi saldo awal
    public AkunBank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method untuk menyimpan uang
    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        cekSaldo();
    }

    // Method untuk mengambil uang
    public void ambilUang(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk menarik Rp. " + jumlah);
        }
        cekSaldo();
    }

    // Method untuk mengecek saldo
    public void cekSaldo() {
        System.out.println("Saldo saat ini: Rp. " + saldo);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek AkunBank dengan saldo awal Rp. 100000
        AkunBank akun = new AkunBank(100000);

        // Menampilkan pesan selamat datang dan saldo awal
        System.out.println("Selamat Datang di Bank ABC");
        akun.cekSaldo();

        // Menyimpan uang sebesar Rp. 500000
        akun.simpanUang(500000);

        // Mengambil uang sebesar Rp. 150000
        akun.ambilUang(150000);
    }
}
```

## OUTPUT

![Screenshot 2024-10-08 202608](https://github.com/user-attachments/assets/fafa3b30-31ee-4924-9955-3814704b1f37)

<p>* Class `AkunBank` untuk mendeklarasikan atribut Saldo</p>
<p>* Pada atribut `saldo` untuk menyimpan saldo yang di inisialisasikan melalui construktor.</p>
<p>* metode `simpanUang(int jumlah)` digunakan untuk menambahkan jumlah uang yang disimpan ke dalam saldo.</p>
<p>* metode `ambilUang(int jumlah)` digunakan untuk mengurangi saldo sesuai jumlah uang yang diambil jika saldo mencukupi.</p>
<p>* metode `cekSaldo()` digunakan untuk menampilkan saldo akhi.r</p>
<p>* `main method` sebagai class utama yang dapat dijalankan untuk membuat objek AkunBank, menampilkan pesan awal, dan memanggil metode sesuai yang di inginkan, jika program dijalankan maka hasil yang ditampilkan akan sesuai pada gambar.</p>





