package minggu3;

/**
 *
 * @author Judha Maygustya
 */
import minggu3.Tugas1_balok;
import java.util.Scanner;

public class Tugas1_bangunRuang {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("+===================== PROGRAM BANGUN RUANG=======================+");
        System.out.print("| Diulangi berapa kali : ");
        int loop = sc.nextInt();
        System.out.println("+=================================================================+");
        System.out.println("                              +-------+");
        System.out.println("                              | Balok |");
        System.out.println("                              +-------+\n");

        for (int i = 0; i < loop; i++) {
            System.out.print("▶ Masukkan Panjang balok : ");
            int panjang = sc.nextInt();
            System.out.print("▶ Masukkan Tinggi balok  : ");
            int tinggi = sc.nextInt();
            System.out.print("▶ Masukkan Lebar balok   : ");
            int lebar = sc.nextInt();

            Tugas1_balok Loh = new Tugas1_balok(panjang, tinggi, lebar);
            System.out.println("Volume Balok Sebesar     : " + Loh.HitungVolume());
            System.out.println("Luas   Balok Sebesar     : " + Loh.LuasPermukaan());
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("                         +-------+");
            System.out.println("                         | Kubus |");
            System.out.println("                         +-------+\n");
            System.out.print("▶ Masukkan Sisi Kubus : ");
            int sisi = sc.nextInt();

            Tugas1_kubus Lah = new Tugas1_kubus(sisi);
            System.out.println("Volume Kubus Sebesar  : " + Lah.HitungVolume());
            System.out.println("Luas   Kubus Sebesar  : " + Lah.luaspermukaan());
            System.out.println();
            System.out.println("--------------------------------------------------------------");
            System.out.println("                         +--------+");
            System.out.println("                         | Tabung |");
            System.out.println("                         +--------+\n");
            System.out.print("▶ Masukkan Jari jari   : ");
            int jarijari = sc.nextInt();
            System.out.print("▶ Masukkan tinggi      : ");
            int tinggitabung = sc.nextInt();

            Tugas1_tabung luh = new Tugas1_tabung(jarijari, tinggitabung);

            System.out.println("Volume Tabung Sebesat  : " + luh.HitungVolume());
            System.out.println("Luas   Tabung Sebesar  : " + luh.luaspermukaan());

        }

    }
}
