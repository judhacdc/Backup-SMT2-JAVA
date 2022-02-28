package minggu_11;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas4_Node {

    String noRek, nama, alamat;
    Tugas4_Node next;

    public Tugas4_Node(String nomorRekening, String nama, String alamat, Tugas4_Node berikutnya) {
        this.noRek = nomorRekening;
        this.nama = nama;
        this.alamat = alamat;
        this.next = berikutnya;
    }

}
