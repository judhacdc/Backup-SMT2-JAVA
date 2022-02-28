/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_15;

import java.util.Comparator;

/**
 *
 * @author Judha Maygustya
 */
public class MhsComparator implements Comparator<Mahasiswa> {

    public int compare(Mahasiswa mhs1, Mahasiswa mhs2) {
        if (mhs1.nim == mhs2.nim) {
            return 0;
        } else {

            return -1;
        }
    }

    @Override
    public Comparator<Mahasiswa> reversed() {
        return Comparator.super.reversed();
    }
}
