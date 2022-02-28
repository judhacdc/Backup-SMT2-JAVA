package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas2_Node {

    String judulBuku;
    Tugas2_Node prev, next;

    Tugas2_Node(Tugas2_Node prev, String judulBuku, Tugas2_Node next) {
        this.prev = prev;
        this.judulBuku = judulBuku;
        this.next = next;
    }

}
