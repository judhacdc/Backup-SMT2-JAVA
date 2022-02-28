package minggu_12;

import minggu_12.prak1_DoubleLinkedList;

/**
 *
 * @author Judha Maygustya
 */
public class prak1_DoubleLinkedListMain {

    public static void main(String[] args) throws Exception {
        prak1_DoubleLinkedList dll = new prak1_DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size);
    }

}
