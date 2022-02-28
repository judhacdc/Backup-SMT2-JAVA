package minggu_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ListMahasiswa {

    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    // -------------------------------------------------- //
    void ascendingSort() {
        this.mahasiswas.sort((Mahasiswa d1, Mahasiswa d2) -> d1.nama.compareTo(d2.nama));
    }

    void descending() {
        this.mahasiswas.sort((Mahasiswa d1, Mahasiswa d2) -> d2.nama.compareTo(d1.nama));

    }
    // --------------------------------------------------//

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleena", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhleena Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        // --------------------------------------------------//
        Mahasiswa key = new Mahasiswa("201235", null, null);
        lm.update(Collections.binarySearch(lm.mahasiswas, key, new MhsComparator()),
                new Mahasiswa("201235", "Akhleema", "021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\n");

        System.out.println("Ascending : ");
        lm.ascendingSort();
        lm.tampil();

        System.out.println("\n");

        System.out.println("Descending : ");
        lm.descending();
        lm.tampil();
    }
}
