package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas3_DoubleLinkedList {

    Tugas3_Node front, rear;
    int size;

    public Tugas3_DoubleLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void Enqueue(int nomor, String nama) {
        Tugas3_Node newNode = new Tugas3_Node(null, nomor, nama, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            System.out.println(front.nama + " telah selesai divaksin");
            front = front.next;
            front.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (front.next == null) {
            front = null;
            size--;
            return;
        }
        Tugas3_Node current = front;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Tugas3_Node tmp = front;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|Nomor\t|Nama\t|");
            while (tmp != null) {
                System.out.println("|" + tmp.nomor + "\t|" + tmp.nama + "\t|");
                tmp = tmp.next;
            }
            System.out.print("Sisa Antrian: " + size);
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {

            Tugas3_Node tmp = front;

            System.out.println("Elemen Teratas : " + tmp.nama + " " + tmp.nomor);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

}
