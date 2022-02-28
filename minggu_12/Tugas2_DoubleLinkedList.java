package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas2_DoubleLinkedList {

    Tugas2_Node head;
    int size;

    public Tugas2_DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(String judulbuku) {
        if (isEmpty()) {
            head = new Tugas2_Node(null, judulbuku, null);
        } else {
            Tugas2_Node newNode = new Tugas2_Node(null, judulbuku, head);
            head.prev = newNode;
            head = newNode;
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
            Tugas2_Node tmp = head;
            System.out.println("--------------------------");
            System.out.println("Cetak Seluruh Judul Buku");
            System.out.println("--------------------------");
            while (tmp != null) {
                System.out.println(tmp.judulBuku + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih kosong, tidak depat dihapus");
        } else {
            System.out.println(head.judulBuku + " Berhasil Di Hapus");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public String GetFirst() {
        return head.judulBuku;
    }
}