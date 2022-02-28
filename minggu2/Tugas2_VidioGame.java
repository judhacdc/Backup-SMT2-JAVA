package minggu2;
/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas2_VidioGame {

    int id, lama_sewa;
    int harga_sewa;
    String nama_member, nama_game;

    void listGame() {
        System.out.println(id + "  " + nama_game + "   " + harga_sewa + "/hari");
    }

    Tugas2_VidioGame(int no, int harga, String nama) {
        id = no;
        harga_sewa = harga;
        nama_game = nama;
    }

    int bayarSewa() {
        int total = lama_sewa * harga_sewa;
        return total;
    }

    void strukSewa() {
        System.out.println("\n+--------------------------------------+");
        System.out.println("|                 N O T A              | ");
        System.out.println("+--------------------------------------+");
        System.out.println("▶ Nama Penyewa    : " + nama_member);
        System.out.println("▶ ID Game         : " + id);
        System.out.println("▶ Nama Game       : " + nama_game);
        System.out.println("▶ Lama Sewa       : " + lama_sewa + "hari");
        System.out.println("▶ Harga Sewa      : " + harga_sewa + "/hari");
        System.out.println("▶ Total Bayar     : " + bayarSewa());
    }

    // ------------ Method Main -------------------- //
    public static void main(String[] args) {
        boolean condition = true;
        do {
            Scanner sc = new Scanner(System.in);
            Tugas2_VidioGame a1 = new Tugas2_VidioGame(1421, 30000, "Nanatsu no Taizai");
            Tugas2_VidioGame a2 = new Tugas2_VidioGame(2981, 15000, "Enen no Shibota-I");
            Tugas2_VidioGame a3 = new Tugas2_VidioGame(3712, 35000, "Jujitsu no Kaisen");
            Tugas2_VidioGame a4 = new Tugas2_VidioGame(4993, 65000, "Kimetsu no Yaibaa");
            Tugas2_VidioGame a5 = new Tugas2_VidioGame(5821, 78000, "Tsubasa Ozora V.2");

            // print
            System.out.println("+========================================+");
            System.out.println("|             LIST VIDIO GAME            |");
            System.out.println("+========================================+");
            a1.listGame();
            a2.listGame();
            a3.listGame();
            a4.listGame();
            a5.listGame();
            System.out.print("\n\nPilih ID Game: ");
            int opsi = sc.nextInt();

            if (opsi == 1421) {
                System.out.print("▶Masukkan Lama Sewa    : ");
                a1.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("▶Masukkan Nama Member  : ");
                a1.nama_member = sc.nextLine();
                a1.strukSewa();
                System.out.println("\n");
            } else if (opsi == 2981) {
                System.out.print("▶Masukkan Lama Sewa    : ");
                a2.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("▶Masukkan Nama Member  : ");
                a2.nama_member = sc.nextLine();
                a2.strukSewa();
                System.out.println("\n");
            } else if (opsi == 3712) {
                System.out.print("▶Masukkan Lama Sewa    : ");
                a3.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("▶Masukkan Nama Member  : ");
                a3.nama_member = sc.nextLine();
                a3.strukSewa();
                System.out.println("\n");
            } else if (opsi == 4993) {
                System.out.print("▶Masukkan Lama Sewa    : ");
                a4.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("▶Masukkan Nama Member  : ");
                a4.nama_member = sc.nextLine();
                a4.strukSewa();
                System.out.println("\n");
            } else if (opsi == 5821) {
                System.out.print("▶Masukkan Lama Sewa    : ");
                a5.lama_sewa = sc.nextInt();
                sc.nextLine();
                System.out.print("▶Masukkan Nama Member  : ");
                a5.nama_member = sc.nextLine();
                a5.strukSewa();
                System.out.println("\n");
            } else {
                System.out.println("Maaf ID tidak ditemukan . . .");            
                condition = false;
            }
        } while (condition == true);
    }
}
