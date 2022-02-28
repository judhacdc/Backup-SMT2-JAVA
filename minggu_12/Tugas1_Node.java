package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas1_Node {

    int data;
    Tugas1_Node prev, next;

    public Tugas1_Node(Tugas1_Node prev, int data, Tugas1_Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;

    }
}
