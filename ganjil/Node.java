package ganjil;

/**
 *
 * @author Judha Maygustya
 */
public class Node {

    int kdTransaksi;
    Transaksi transaksi;
    Node next;

    public Node(int kode, Transaksi transaksi, Node next) {
        this.kdTransaksi = kode;
        this.transaksi = transaksi;
        this.next = next;
    }
}
