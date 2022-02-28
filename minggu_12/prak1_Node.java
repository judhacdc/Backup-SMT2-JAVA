package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class prak1_Node {

    int data;
    prak1_Node prev;
    prak1_Node next;

    prak1_Node(prak1_Node prev, int data, prak1_Node next) {

        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
