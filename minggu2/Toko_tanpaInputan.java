package minggu2;


public class Toko_tanpaInputan {

    String nama;
    int hargaSatuan;
    int jumlah;

    int hitungHargaTotal() {
        int total = hargaSatuan * jumlah;
        return total;
    }

    int hitungDiskon() {
        int diskon;
        if (hitungHargaTotal() > 10000) {
            diskon = hitungHargaTotal() * 10 / 100;
        } else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            diskon = hitungHargaTotal() * 5 / 100;
        } else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }

    public static void main(String[] args) {
        Toko_tanpaInputan y1 = new Toko_tanpaInputan();
        y1.nama = "Beras";
        y1.hargaSatuan = 1000000;
        y1.jumlah = 5;
        int totalsemua = y1.hitungHargaTotal();
        int diskon1 = y1.hitungDiskon();
        int bayar1 = y1.hitungHargaBayar();

        System.out.println("Nama Barang                    : " + y1.nama);
        System.out.println("Jumlah                         : " + y1.jumlah);
        System.out.println("Harga Satuan                   : Rp." + y1.hargaSatuan);
        System.out.println("Potongan Diskon yang di dapat  : Rp." + y1.hitungDiskon());
        System.out.println("Total Bayar                    : Rp." + y1.hitungHargaBayar());
    }
}