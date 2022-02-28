package minggu2;

import java.util.Scanner;
public class Toko_denganInputan {

    String nama;
    int hargaSatuan;
    int jumlah;
    int hitungHargaTotal() {
        int total = hargaSatuan * jumlah;
        return total;
    }
    int hitungDiskon() {
        int diskon;
        if (hitungHargaTotal() > 100000) {
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
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nama Barang  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Harga Satuan : ");
        int harga = sc.nextInt();
        System.out.print("Masukkan Jumlah       : ");
        int jumlah = sc.nextInt();       
        Toko_denganInputan y1 = new Toko_denganInputan();
        y1.nama = nama ;
        y1.hargaSatuan = harga;
        y1.jumlah = jumlah;
       
        System.out.println("-------------------------------------------");
        System.out.println("Nama Barang                   : " + y1.nama);
        System.out.println("Jumlah                        : " + y1.jumlah);
        System.out.println("Harga Satuan                  : Rp." + y1.hargaSatuan);
        System.out.println("Potongan Diskon yang di dapat : Rp." + y1.hitungDiskon());
        System.out.println("Total Bayar                   : Rp." + y1.hitungHargaBayar());
    }
}