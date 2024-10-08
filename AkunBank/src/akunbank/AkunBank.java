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