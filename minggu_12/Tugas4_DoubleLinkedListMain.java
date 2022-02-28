package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas4_DoubleLinkedListMain {

    public static void menu() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("=====================================");
        System.out.println("1.  Tambah Data Awal");
        System.out.println("2.  Tambah Data Akhir");
        System.out.println("3.  Tambah Data Index Tertentu");
        System.out.println("4.  Hapus Data Awal");
        System.out.println("5.  Hapus Data Akhir");
        System.out.println("6.  Hapus Data Tertentu");
        System.out.println("7.  Cetak");
        System.out.println("8.  Cari NIM");
        System.out.println("9.  Urut Data IPK-DESC");
        System.out.println("10. Keluar");
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sss = new Scanner(System.in);
        int menu = 0, index, masuk;
        String nim, nama, nilai;

        Tugas4_DoubleLinkedList dll = new Tugas4_DoubleLinkedList();

        while (menu != 10) {
            menu();
            menu = sc.nextInt();
            System.out.println("=====================================");

            try {
                switch (menu) {
                    case 1:
                        System.out.println("TAMBAH DATA AWAL");
                        System.out.print("NIM : ");
                        nim = sss.nextLine();
                        System.out.print("Nama : ");
                        nama = sss.nextLine();
                        System.out.print("IPK : ");
                        nilai = sss.nextLine();
                        dll.addFirst(nim, nama, nilai);
                        break;
                    case 2:
                        System.out.println("TAMBAH DATA AKHIR");
                        System.out.print("NIM : ");
                        nim = sss.nextLine();
                        System.out.print("Nama : ");
                        nama = sss.nextLine();
                        System.out.print("IPK : ");
                        nilai = sss.nextLine();
                        dll.addLast(nim, nama, nilai);
                        break;
                    case 3:
                        System.out.println("TAMBAH DATA INDEX TERTENTU");
                        System.out.print("NIM : ");
                        nim = sss.nextLine();
                        System.out.print("Nama : ");
                        nama = sss.nextLine();
                        System.out.print("IPK : ");
                        nilai = sss.nextLine();
                        System.out.print("Masukkan posisi index : ");
                        index = sc.nextInt();
                        dll.add(nim, nama, nilai, index);
                        break;
                    case 4:
                        System.out.println("HAPUS DATA PERTAMA");
                        dll.removeFirst();
                        break;
                    case 5:
                        System.out.println("HAPUS DATA TERAKHIR");
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.println("HAPUS DATA TERTENTU");
                        System.out.print("Masukkan posisi index : ");
                        index = sc.nextInt();
                        dll.remove(index);
                        break;
                    case 7:
                        System.out.println("CETAK");
                        dll.print();
                        System.out.println("Size : " + dll.size());
                        break;
                    case 8:
                        System.out.println("CARI NIM");
                        System.out.print("Masukkan data yang ingin dicari : ");
                        masuk = sc.nextInt();
                        dll.search(masuk);
                        break;
                    case 9:
                        System.out.println("URUT DATA IPK-DESC");
                        dll.sort();
                        dll.print();
                        break;
                    case 10:
                        System.out.println("KELUAR");
                        break;
                }
                System.out.println();
            } catch (Exception e) {
            }
        }
    }
}
