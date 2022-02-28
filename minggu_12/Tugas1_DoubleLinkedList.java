package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas1_DoubleLinkedList {

    Tugas1_Node head;
    int size;
    
    public Tugas1_DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Tugas1_Node(null, item, null);
        } else {
            Tugas1_Node newNode = new Tugas1_Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Tugas1_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Tugas1_Node newNode = new Tugas1_Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Indeks di luar batas");
        } else {
            Tugas1_Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Tugas1_Node newNode = new Tugas1_Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Tugas1_Node newNode = new Tugas1_Node(current.prev, item, current);
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
            Tugas1_Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih kosong,tidak dapat diahapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih kosong,tidak dapat diahapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Tugas1_Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Indeks diluar batas!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Tugas1_Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;

                current.prev = null;
                head = current;

            } else {

                current.prev.next = current.next;

                current.next.prev = current.prev;
            }
            size--;

        }

    }

    public int getFirst() throws Exception {

        if (isEmpty()) {

            throw new Exception("Linked Liat kosong");

        }
        return head.data;
    }

    public int getLast() throws Exception {

        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Tugas1_Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {

        if (isEmpty() || index > size) {
            throw new Exception("Nilai indeke di luar batas.");
        }
        Tugas1_Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int cariData(int caridata) throws Exception {
        if (isEmpty()) {
            System.out.println("Linked List Masih kosong");
        }
        Tugas1_Node tmp = head;
        int posisi = -1;
        int index = 0;
        while (tmp != null) {
            if (tmp.data == caridata) {
                posisi = index;
            }
            index++;
            tmp = tmp.next;
        }
        return posisi;
    }

    public void BubbleSort() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        } else {
            Tugas1_Node tmp = head;
            while (tmp != null) {
                Tugas1_Node temp2 = tmp.next;
                while (temp2 != null) {
                    if (tmp.data < temp2.data) {
                        int tempdata = tmp.data;
                        tmp.data = temp2.data;
                        tmp.next.data = tempdata;
                    }
                    temp2 = temp2.next;
                }
                tmp = tmp.next;
            }
            Tugas1_Node printdata = head;
            while (printdata != null) {
                System.out.print(printdata.data + "\t");
                printdata = printdata.next;
            }
            System.out.println();
        }
    }

}
