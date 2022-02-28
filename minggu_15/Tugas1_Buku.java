package minggu_15;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas1_Buku {

    String isbn;
    String judul;
    String terbit;
    String penerbit;

    public Tugas1_Buku() {
    }

    public Tugas1_Buku(String isbn, String judul, String terbit, String penerbit) {
        this.isbn = isbn;
        this.judul = judul;
        this.terbit = terbit;
        this.penerbit = penerbit;
    }

    @Override
    public String toString() {
        return "Buku{" + "isbn=" + isbn + ", judul=" + judul + ", terbit=" + terbit + ", penerbit=" + penerbit + '}';
    }
}
