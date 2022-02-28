package ganjil;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class BarangMain {

    static Barang[] p = new Barang[6];

    static void setDataBarang() {
        p[0] = new Barang(1, "Stik PS 2", 200000, 100);
        p[1] = new Barang(2, "Kaset PS God Of War", 300000, 200);
        p[2] = new Barang(3, "Hard Disk Full Game", 150000, 300);
        p[3] = new Barang(4, "Playstation 5 ", 250000, 400);
        p[4] = new Barang(5, "TV LCD 24 inch", 400000, 500);
        p[5] = new Barang(6, "Memory Card PS 8 GB", 500000, 600);
    }

    static void printBarang() {
        System.out.println("===================================================");
        System.out.println("No" + "\t" + "Nama Barang" + "\t" + "Harga" + "\t" + "Stock");
        for (Barang barang : p) {
            System.out.printf("%-3d %-20s %-8d %-3d\n", barang.kode, barang.nama, barang.harga, barang.stok);
        }
        System.out.println("===================================================");

    }

    static void mainMenu() {

        System.out.println("█▀▀ █▀▀ █── █▀▀█ █▀▄▀█ █▀▀█ ▀▀█▀▀ 　 █▀▀▄ █▀▀█ ▀▀█▀▀ █▀▀█ █▀▀▄ █▀▀▀ \n"
                + "▀▀█ █▀▀ █── █▄▄█ █─▀─█ █▄▄█ ──█── 　 █──█ █▄▄█ ──█── █▄▄█ █──█ █─▀█ \n"
                + "▀▀▀ ▀▀▀ ▀▀▀ ▀──▀ ▀───▀ ▀──▀ ──▀── 　 ▀▀▀─ ▀──▀ ──▀── ▀──▀ ▀──▀ ▀▀▀▀\n");
        System.out.println("\n<---------- ≧◉ᴥ◉≦ 𝙎𝙀𝙇𝘼𝙈𝘼𝙏 𝘿𝘼𝙏𝘼𝙉𝙂 𝘿𝙄 𝙅𝙐𝘿𝙃𝘼 𝙋𝙇𝘼𝙔𝙎𝙏𝘼𝙏𝙄𝙊𝙉 ≧◉ᴥ◉≦ ----------->\n");
        System.out.println("+==========================================================================+");
        System.out.println("|\t\t\t\t ＭＥＮＵ  \t\t\t\t   |");
        System.out.println("+==========================================================================+\n");
        System.out.print("1. Input Transaksi\n"
                + "2. Cetak Transaksi\n"
                + "3. Urutan Data\n"
                + "4. Keluar ");
        System.out.println("\n=========================================================================");
    }

    public static void main(String[] args) {
        Scanner judha = new Scanner(System.in);

        setDataBarang();

        LinkedList ll = new LinkedList();

        int menu;
        boolean condition = true;
        do {

            mainMenu();
            menu = judha.nextInt();

            switch (menu) {
                case 1:
                    printBarang();
                    System.out.print("▶ Masukkan Kode Barang   : ");
                    int kodeBarang = judha.nextInt();
                    System.out.print("▶ Masukkan Jumlah Barang : ");
                    int jumlahBeli = judha.nextInt();
                    System.out.println("\nNB : Jika member akan mendapatkan potongan harga 2%");
                    System.out.print("▶ Apakah Anda Member?[Y / N]: ");
                    char pilihan = judha.next().charAt(0);
                    ll.add(kodeBarang, jumlahBeli, p, pilihan);
                    break;

                case 2:
                    ll.cetak();
                    break;

                case 3:
                    System.out.println("+==========================================+");
                    System.out.println("|            SORTING BY NAME               |");
                    System.out.println("+==========================================+\n");
                    ll.PengurutanAscending(true);
                    ll.cetak();
                    break;

                case 4:
                    condition = false;
                    System.out.println("+-----------------------------------------------------------------------------------------------------+");
                    System.out.println("|  ▀▀█▀▀ ▒█▀▀▀ ▒█▀▀█ ▀█▀ ▒█▀▄▀█ ░█▀▀█ ▒█░▄▀ ░█▀▀█ ▒█▀▀▀█ ▀█▀ ▒█░▒█   |\n"
                            + "|  ░▒█░░ ▒█▀▀▀ ▒█▄▄▀ ▒█░ ▒█▒█▒█ ▒█▄▄█ ▒█▀▄░ ▒█▄▄█ ░▀▀▀▄▄ ▒█░ ▒█▀▀█   |\n"
                            + "|  ░▒█░░ ▒█▄▄▄ ▒█░▒█ ▄█▄ ▒█░░▒█ ▒█░▒█ ▒█░▒█ ▒█░▒█ ▒█▄▄▄█ ▄█▄ ▒█░▒█   |");
                    System.out.println("+---------------------------------------------------------------------------------------------------+");
                    break;
            }
        } while (condition != false);
    }
}
