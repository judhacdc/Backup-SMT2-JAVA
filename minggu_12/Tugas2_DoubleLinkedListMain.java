package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas2_DoubleLinkedListMain {

    public static void main(String[] args) throws Exception {
        Scanner Sc = new Scanner(System.in);
        Tugas2_DoubleLinkedList dll = new Tugas2_DoubleLinkedList();
        int menu;
        char A;
        do {
            System.out.println("*********");
            System.out.println("Data Buku Perpusatakaan");
            System.out.println("*********");
            System.out.println();
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cek Judul Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.println("*********");
            System.out.print("Pilihan Menu : ");

            menu = Sc.nextInt();
            if (menu == 1) {
                Sc.nextLine();
                System.out.println("-------------------");
                System.out.println("Masukkan Judul Buku");
                System.out.println("-------------------");
                String namajudul = Sc.nextLine();
                dll.push(namajudul);
            }
            if (menu == 2) {
                if (dll.isEmpty()) {
                    System.out.println("Linked List Masih Kosong");
                } else {
                    dll.removeFirst();
                }
            }
            if (menu == 3) {
                if (dll.isEmpty()) {
                    System.out.println("Linked List Masih Kosong");
                } else {
                    System.out.println("Data Paling Atas Adalah : " + dll.GetFirst());
                }
            }
            if (menu == 4) {
                dll.print();
            }
            if (menu == 5) {
                break;
            }
            System.out.println("");
            System.out.println("======================================");
            System.out.println("Apakah Anda akan kembali ke menu (y/n)");
            System.out.print("Pilih (y/n) : ");
            A = Sc.next().charAt(0);
            System.out.println("======================================");
            System.out.println("");
        } while (A == 'y');
    }
}
