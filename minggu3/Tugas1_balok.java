package minggu3;
/**
 *
 * @author Judha Maygustya
 */
public class Tugas1_balok {

    public int panjang, lebar, tinggi;

    public Tugas1_balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int HitungVolume() {
        return panjang * lebar * tinggi;
    }

    public int LuasPermukaan() {
        return 2 * panjang * tinggi * lebar;
    }

}
