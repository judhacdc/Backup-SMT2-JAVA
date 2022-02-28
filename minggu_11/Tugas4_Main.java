package minggu_11;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas4_Main {

    public static void main(String[] args) {
        Tugas4_SingleLinkedList sll = new Tugas4_SingleLinkedList();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        char pilih;
        int menu;
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data Terakhir");
            System.out.println("3. Lihat Antrian Paling Depan");
            System.out.println("4. Lihat Antrian Paling Belakang");
            System.out.println("5. Mencari Data Nasabah Melalui Index");
            System.out.println("6. Mencari Data Nasabah Melalui Nomor Rekening");
            System.out.println("7. Tampilkan Data");
            System.out.println("8. EXIT");
            System.out.print("Masukkan Pilihan Menu (1-8): ");
            menu = sc.nextInt();
            System.out.println("");
            if (menu < 1 || menu > 8) {
                System.out.println("Masukkan Pilihan Menu Yang Benar!");
            }

            switch (menu) {
                case 1: {
                    do {
                        System.out.print("Masukkan Nomor Rekening Nasabah : ");
                        String no = in.nextLine();
                        System.out.print("Nama Nasabah                    : ");
                        String nama = in.nextLine();
                        System.out.print("Alamat Nasabah                  : ");
                        String alamat = in.nextLine();
                        System.out.print("Apakah anda ingin menambah data baru?(y/n) : ");
                        pilih = sc.next().charAt(0);
                        sll.tambahData(no, nama, alamat);
                        System.out.println("");
                    } while (pilih == 'y' || pilih == 'Y');
                }
                break;
                case 2: {
                    sll.remove();
                    System.out.println("");
                }
                break;
                case 3: {
                    sll.antrianDepan();
                    System.out.println("");
                }
                break;
                case 4: {
                    sll.antrianBelakang();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.print("Masukkan Index Pada Data Yang Dicari : ");
                    int idx = sc.nextInt();
                    sll.cariDataIndex(idx);
                    System.out.println("");
                }
                break;
                case 6: {
                    System.out.print("Masukkan Nomor Rekening Nasabah Yang Ingin Dicari : ");
                    String no = in.nextLine();
                    sll.cariDataNoRek(no);
                    System.out.println("");
                }
                break;
                case 7: {
                    sll.print();
                    System.out.println("");
                }
            }
        } while (menu > 0 && menu < 8);
        System.out.println("TERIMA KASIH :D");
    }

}
