package ganjil;

/**
 *
 * @author Judha Maygustya
 */
public class Barang {

    int kode;
    String nama;
    int harga;
    int stok;
    

    public Barang(int kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int Harga() {
        return this.harga;
    }

    public void Stock (int jumlahBeli) {
        this.stok -= jumlahBeli;
    }

    public String Nama() {
        return this.nama;
    }

    public int Stock() {
        return this.stok;
    }
}
