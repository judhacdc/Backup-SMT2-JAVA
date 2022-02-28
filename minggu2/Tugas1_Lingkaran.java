package minggu2;
/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas1_Lingkaran {

    double phi, r;

    double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }

    double hitungKeliling() {
        double keliling = (r + r) * phi;
        return keliling;
    }
    
    // ------------ Method Main -------------------- //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("+====================================+");
            System.out.println("|        PROGRAM LINGKARAN           |");
            System.out.println("+------------------------------------+");
            System.out.print("| Masukkan Jari-Jari lingkaran : ");
            double jari = sc.nextInt();
            //inisialisasi
            Tugas1_Lingkaran a1 = new Tugas1_Lingkaran();
            a1.phi = 3.14;
            a1.r = jari;
            System.out.println("+------------------------------------+");
            a1.hitungKeliling();
            a1.hitungLuas();
            System.out.println("| ▶ Keliling Lingkaran : " + (int) a1.hitungKeliling() + "         |");
            System.out.println("| ▶ Luas Lingkaran     : " + (int) a1.hitungLuas() + "        |");
            System.out.println("+------------------------------------+\n\n");
        } while (true);
    }

}
