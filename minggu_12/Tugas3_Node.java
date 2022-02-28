package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas3_Node {

    String nama;
    int nomor;
    Tugas3_Node prev, next;

    Tugas3_Node(Tugas3_Node prev, int nomor, String nama, Tugas3_Node next) {
        this.prev = prev;
        this.nama = nama;
        this.nomor = nomor;
        this.next = next;
    }
}
