package minggu_12;

import minggu_12.prak2_DoubleLinkedList;

/**
 *
 * @author Judha Maygustya
 */
public class prak2_DoubleLinkedListMain {

    public static void main(String[] args) throws Exception {
        prak2_DoubleLinkedList dll = new prak2_DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size);
    }
}
