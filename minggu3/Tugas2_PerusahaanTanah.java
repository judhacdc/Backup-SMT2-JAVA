package minggu3;
/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas2_PerusahaanTanah {

    int panjang, lebar;

    int MenghitungLuas() {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("  PROGRAM HITUNG LUAS TANAH");
        System.out.println("+=============================+");
        System.out.print("| Masukkan Jumlah Tanah : ");
        int jumlah = sc.nextInt();
        System.out.println("+=============================+\n");

        //instansiasti array of object
        Tugas2_PerusahaanTanah[] banyakTanah = new Tugas2_PerusahaanTanah[jumlah];

        for (int i = 0; i < jumlah; i++) {

            banyakTanah[i] = new Tugas2_PerusahaanTanah();
            System.out.println("+-----------------------------+");
            System.out.println("| Data Tanah ke-" + (i + 1));
            System.out.print("| Masukkan Panjang Tanah : ");
            banyakTanah[i].panjang = sc.nextInt();
            System.out.print("| Masukkan Luas Tanah    : ");
            banyakTanah[i].lebar = sc.nextInt();
            System.out.println("+-----------------------------+\n");

        }
        System.out.println("================ HASIL PERHITUNGAN ===============\n");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("+---------------------+");
            System.out.println("|      Luas Tanah     |");
            System.out.println("+---------------------+");
            System.out.println("Luas dari Tanah ke-" + (i + 1));
            System.out.println("Luas : " + banyakTanah[i].MenghitungLuas());
            System.out.println("");
        }
    }
}


