package minggu_11;

/**
 *
 * @author Judha Maygustya
 */
public class prak1_SingleLinkedList {

    prak1_Node head;
    prak1_Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            prak1_Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong!!");
        }
    }

    public void addFirst(int input) {
        prak1_Node ndInput = new prak1_Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input) {
        prak1_Node ndInput = new prak1_Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        prak1_Node ndInput = new prak1_Node(input, null);
        prak1_Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Indeks Salah!!");
        } else if (index == 0) {
            addFirst(input);
        } else {
            prak1_Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new prak1_Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

}
// Judha Maygustya
