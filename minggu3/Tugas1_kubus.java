package minggu3;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas1_kubus {

    public int sisi;

    public Tugas1_kubus(int s) {
        sisi = s;
    }

    public int HitungVolume() {
        return sisi * sisi * sisi;

    }

    public int luaspermukaan() {
        return 6 * sisi * sisi;

    }
}
