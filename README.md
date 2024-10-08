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

| akunsaya : AkunBank |
| ---------------------|
| Saldo : 100000       | 
| simpanUang(500000)   |
| ambilUang(150000)    |
| cekSaldo()           |
<p> Objek 'akunSaya' merupakan instance dari class AkunBank</p>
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

