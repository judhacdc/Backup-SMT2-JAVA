/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

public class prak_BarangMain {

    public static void main(String[] args) {

        prak_Barang b1 = new prak_Barang();

        b1.namaBarang = "Corsair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 0;
        //b1.tambahStok(1);
        b1.kurangStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = " + hargaTotal);
        prak_Barang b2 = new prak_Barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
        prak_Barang b3 = new prak_Barang ("Razer","Headset Gaming",12,300000);
        b3.tampilBarang();

    }
}
// KODE DIBUAT OLEH :
// Nama : Judha Maygustya
// Nim  : 2041720005
// Kelas: TI-1E

