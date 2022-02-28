package ganjil;

/**
 *
 * @author Judha Maygustya
 */
public class Transaksi {

    int kode;
    String namaBarang;
    int hargaSatuan;
    int jumlahBarang;
    int hargaTotal;
    int bayar;

    public Transaksi(int kode, String namaBarang, int hargaSatuan, int jumlahBarang, int hargaTotal, int bayar) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaSatuan = hargaSatuan;
        this.jumlahBarang = jumlahBarang;
        this.hargaTotal = hargaTotal;
        this.bayar = bayar;
    }
}
