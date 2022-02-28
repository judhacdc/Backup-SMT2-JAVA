package minggu_11;

/**
 *
 * @author Judha Maygustya
 */
public class prak1_SLLMain {

    public static void main(String[] args) throws Exception {

        prak1_SingleLinkedList singLL = new prak1_SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

    }
}
// Judha Maygustya
