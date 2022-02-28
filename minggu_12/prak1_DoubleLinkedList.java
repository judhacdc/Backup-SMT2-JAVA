package minggu_12;


/**
 *
 * @author Judha Maygustya
 */
public class prak1_DoubleLinkedList {

    prak1_Node head;
    int size;

    public prak1_DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new prak1_Node(null, item, null);
        } else {
            prak1_Node newNode = new prak1_Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            prak1_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            prak1_Node newNode = new prak1_Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            prak1_Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                prak1_Node newNode = new prak1_Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                prak1_Node newNode = new prak1_Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            prak1_Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

}
