package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas4_DoubleLinkedList {

    Tugas4_Node head;
    int size;

    public Tugas4_DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nama, String nilai) {
        if (isEmpty()) {
            head = new Tugas4_Node(null, nim, nama, nilai, null);
        } else {
            Tugas4_Node newNode = new Tugas4_Node(null, nim, nama, nilai, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nim, String nama, String nilai) {
        if (isEmpty()) {
            addFirst(nim, nama, nilai);
        } else {
            Tugas4_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Tugas4_Node newNode = new Tugas4_Node(current, nim, nama, nilai, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String nim, String nama, String nilai, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, nilai);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Tugas4_Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Tugas4_Node newNode = new Tugas4_Node(null, nim, nama, nilai, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Tugas4_Node newNode = new Tugas4_Node(current.prev, nim, nama, nilai, current);
                newNode.prev = newNode;
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
            Tugas4_Node tmp = head;
            System.out.println("NIM\t\t Nama \t\t\t IPK");
            while (tmp != null) {
                System.out.print(tmp.nim + "\t\t ");
                System.out.print(tmp.nama + "\t\t ");
                System.out.print(tmp.nilai + "\t");
                System.out.println("");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
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
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Tugas4_Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Tugas4_Node current = head;
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

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return (head.nim + head.nama + head.nilai);
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Tugas4_Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return (tmp.nim + tmp.nama + tmp.nilai);
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Tugas4_Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return (tmp.nim + tmp.nama + tmp.nilai);
    }

    public void search(int search) {
        int i = 0;
        boolean cek = false;
        Tugas4_Node current = head;
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
        while (current != null) {
            if (current.data == search) {
                cek = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (cek) {
            System.out.println("Data " + search + " ditemukan pada index ke : " + i);
        } else {
            System.out.println("Index tidak ditemukan");
        }
    }

    public void sort() {
        Tugas4_Node current = null, index = null;
        String temp, tmpn;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (Integer.parseInt(current.nilai) < Integer.parseInt(index.nilai)) {
                        temp = current.nilai;
                        current.nilai = index.nilai;
                        index.nilai = temp;
                        tmpn = current.nama;
                        current.nama = index.nama;
                        index.nama = tmpn;
                    }
                }
            }
        }
    }
}
