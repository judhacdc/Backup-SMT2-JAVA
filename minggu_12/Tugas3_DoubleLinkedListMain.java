package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas3_DoubleLinkedListMain {

    public static void menu() {
        System.out.println("█▀▀ █▀▀ █── █▀▀█ █▀▄▀█ █▀▀█ ▀▀█▀▀ 　 █▀▀▄ █▀▀█ ▀▀█▀▀ █▀▀█ █▀▀▄ █▀▀▀ \n"
                + "▀▀█ █▀▀ █── █▄▄█ █─▀─█ █▄▄█ ──█── 　 █──█ █▄▄█ ──█── █▄▄█ █──█ █─▀█ \n"
                + "▀▀▀ ▀▀▀ ▀▀▀ ▀──▀ ▀───▀ ▀──▀ ──▀── 　 ▀▀▀─ ▀──▀ ──▀── ▀──▀ ▀──▀ ▀▀▀▀");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4.Peek");
        System.out.println("5. Keluar");

        System.out.println("++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sss = new Scanner(System.in);
        int menu = 0;

        Tugas3_DoubleLinkedList dll = new Tugas3_DoubleLinkedList();

        while (menu != 4) {
            menu();
            menu = sc.nextInt();
            System.out.println("=====================================");
            try {
                switch (menu) {
                    case 1:
                        System.out.println("-----------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("-----------------------------");
                        System.out.print("Nomor Antrian: ");
                        int no = sc.nextInt();
                        System.out.print("Nama Penerima: ");
                        String nama = sss.nextLine();
                        dll.Enqueue(no, nama);
                        System.out.println("-------------------");
                        dll.print();
                        break;
                    case 2:
                        dll.Dequeue();
                        dll.print();
                        break;
                    case 3:
                        dll.print();
                        break;

                    case 4:
                        dll.peek();
                        break;
                        
                    case 5:
                        System.out.println();
                        System.out.println("+--------------------------------------------------------------------------------------------------+");
                        System.out.println("|                                     （・⊝・）  Terimakasih  （・⊝・）                               |");
                        System.out.println("|                                       ★ JVAKSIN ANISA II ★                                      |");
                        System.out.println("|                                ★ Jl.Mawar Kec.CandiRenggo Kab.Singosari ★                       |");
                        System.out.println("|                                     ★ Telp (089)679-051-1179 ★                                  |");
                        System.out.println("+--------------------------------------------------------------------------------------------------+");
                        System.out.println("|  ▀▀█▀▀ ▒█▀▀▀ ▒█▀▀█ ▀█▀ ▒█▀▄▀█ ░█▀▀█ ▒█░▄▀ ░█▀▀█ ▒█▀▀▀█ ▀█▀ ▒█░▒█   |\n"
                                + "|  ░▒█░░ ▒█▀▀▀ ▒█▄▄▀ ▒█░ ▒█▒█▒█ ▒█▄▄█ ▒█▀▄░ ▒█▄▄█ ░▀▀▀▄▄ ▒█░ ▒█▀▀█   |\n"
                                + "|  ░▒█░░ ▒█▄▄▄ ▒█░▒█ ▄█▄ ▒█░░▒█ ▒█░▒█ ▒█░▒█ ▒█░▒█ ▒█▄▄▄█ ▄█▄ ▒█░▒█   |");
                        System.out.println("+---------------------------------------------------------------------------------------------------+");

                        System.out.println("\n");
                        break;
                }
                System.out.println();
            } catch (Exception e) {

            }
        }
    }
}
