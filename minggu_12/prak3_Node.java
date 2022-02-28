package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class prak3_Node {

    int data;
    prak3_Node prev;
    prak3_Node next;

    prak3_Node(prak3_Node prev, int data, prak3_Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
