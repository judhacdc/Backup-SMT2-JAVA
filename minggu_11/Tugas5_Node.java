package minggu_11;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas5_Node {

    String nama, alamat, noRek;
    Tugas5_Node next;

    public Tugas5_Node(String nomorrekening, String nama, String alamat, Tugas5_Node berikutnya) {
        this.noRek = nomorrekening;
        this.nama = nama;
        this.alamat = alamat;
        this.next = berikutnya;
    }
}
