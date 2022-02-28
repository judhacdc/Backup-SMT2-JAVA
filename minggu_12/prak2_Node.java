package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class prak2_Node {

    int data;
    prak2_Node prev;
    prak2_Node next;

    prak2_Node(prak2_Node prev, int data, prak2_Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
