package minggu_15;

public class Tugas2_Mahasiswa17 {

    String nim, nama, notelp;

    public Tugas2_Mahasiswa17() {
    }

    public Tugas2_Mahasiswa17(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp="+ notelp + '}';
    }
}
