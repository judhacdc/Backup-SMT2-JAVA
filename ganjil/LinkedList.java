package ganjil;

/**
 *
 * @author Judha Maygustya
 */
public class LinkedList {

    Node head;
    Node tail;
    int size = 0;
    int tempHarga = 0;
    String tempNama = "";

    public boolean isEmpty() {
        return head == null;
    }

    public void minStock(int kodeBarang, int jmlBeli, Barang[] barangs) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i].kode == kodeBarang) {
                barangs[i].Stock(jmlBeli);
                break;
            }
        }
    }

    public boolean cekKD(int kodeBarang, Barang[] barangs) {
        if (kodeBarang < 1) {
            return false;
        } else if (kodeBarang > barangs.length) {
            return false;
        } else {
            return true;
        }
    }

    public void atBarang(int kodeBarang, Barang[] barangs) {
        for (int i = 0; i < barangs.length; i++) {
            if (barangs[i].kode == kodeBarang) {
                tempHarga = barangs[i].Harga();
                tempNama = barangs[i].Nama();
            }
        }
    }

    public boolean ckStock(int kodeBarang, int jmlhBeli, Barang[] barangs) {
        boolean kondisi = true;
        if (jmlhBeli < 1) {
            kondisi = false;
        } else {
            for (int i = 0; i < barangs.length; i++) {
                if (barangs[i].kode == kodeBarang) {
                    int stock = barangs[i].Stock();
                    if (jmlhBeli > stock) {
                        kondisi = false;
                        break;
                    }
                }
            }
        }
        return kondisi;
    }
// cetak 

    public void cetak() {
        Node tmp = head;
        while (tmp != null) {

            System.out.println(" +=========================================================+");
            System.out.println(" |                     JUDHA PLAYSTATION                   |");
            System.out.println(" |             Jl.Mawar Kec.Pandaan Kab.Pasuruan           |");
            System.out.println(" |                Telp (089)679 - 051 - 1179               |");
            System.out.println(" +=========================================================+");
            System.out.println("Kode Transaksi      : " + tmp.kdTransaksi);
            System.out.println("Nama Barang         : " + tmp.transaksi.namaBarang);
            System.out.println("Harga Satuan        : " + tmp.transaksi.hargaSatuan);
            System.out.println("Jumlah Barang       : " + tmp.transaksi.jumlahBarang);
            System.out.println("Harga Total         : " + tmp.transaksi.hargaSatuan * tmp.transaksi.jumlahBarang);
            System.out.println("Bayar               : " + tmp.transaksi.bayar);
            tmp = tmp.next;
            System.out.println(" +=========================================================+\n");
        }
    }
// Sorting ascebding

    void PengurutanAscending(boolean bool) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.transaksi.namaBarang.compareToIgnoreCase(tmp.transaksi.namaBarang) > 0) {
                String temp = tmp.transaksi.namaBarang;
                tmp.transaksi.namaBarang = tmp.transaksi.namaBarang;
                tmp.transaksi.namaBarang = temp;
            }
            tmp = tmp.next;
        }
    }

    public void add(int kodeBarang, int jumlah, Barang[] barangs, char inputMember) {
        //if kode not found
        if (cekKD(kodeBarang, barangs)) {
            //jika tidak lebih besar dari stok
            if (ckStock(kodeBarang, jumlah, barangs)) {
                atBarang(kodeBarang, barangs);
                int hargatotal = tempHarga * jumlah;

                //disc 5% 
                if (hargatotal > 500000) {
                    hargatotal -= (hargatotal * 5 / 100);
                }
                //if user equals member get disc 2%
                if (inputMember == 'Y' || inputMember == 'y') {
                    hargatotal -= (hargatotal * 2 / 100);
                }

                Transaksi transaksi = new Transaksi(kodeBarang, tempNama, tempHarga, jumlah, tempHarga, hargatotal);
                Node nodeInput = new Node(++size, transaksi, null);
                minStock(kodeBarang, jumlah, barangs);
                if (isEmpty()) {
                    head = nodeInput;
                    tail = nodeInput;
                } else {
                    tail.next = nodeInput;
                    tail = nodeInput;
                }
            } else {
                System.out.println("\nTranksaksi tidak dapat di lanjutkan"
                        + "\nBarang Melebihi Stock Toko Playstation !!! \n");
            }
        } else {
            System.out.println("[invalid] Kode Barang Tidak Ditemukan!!");
        }
    }
}
