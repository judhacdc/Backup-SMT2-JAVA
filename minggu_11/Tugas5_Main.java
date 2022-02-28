package minggu_11;
/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas5_Main {

    public static void main(String[] args) {
        Tugas5_SingleLinkedList sll = new Tugas5_SingleLinkedList();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        char pilih;
        int menu, jmlh;
        int i = 0;
        System.out.print("Masukkan jumlah nasabah : ");
        jmlh = sc.nextInt();
        System.out.println("");
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah Data (Enqueue)");
            System.out.println("2. Hapus Data Terakhir (Dequeue)");
            System.out.println("3. Lihat Antrian Paling Depan (Peek)");
            System.out.println("4. Lihat Antrian Paling Belakang (Peek Rear)");
            System.out.println("5. Mencari Data Nasabah Melalui Index");
            System.out.println("6. Mencari Data Nasabah Melalui Nomor Rekening");
            System.out.println("7. Tampilkan Data (Print)");
            System.out.println("8. Kosongkan Semua Data (Clear)");
            System.out.println("9. EXIT");
            System.out.print("Masukkan Pilihan Menu (1-9): ");
            menu = sc.nextInt();
            System.out.println("");
            if (menu < 1 || menu > 9) {
                System.out.println("Masukkan Pilihan Menu Yang Benar!");
            }
            switch (menu) {
                case 1: {
                    do {
                        if (i == jmlh) {
                            System.out.println("Data Anda Sudah Penuh, Pilih Menu Yang Lain!");
                            continue;
                        }
                        System.out.print("Masukkan Nomor Rekening Nasabah : ");
                        String no = in.nextLine();
                        System.out.print("Nama Nasabah                    : ");
                        String nama = in.nextLine();
                        System.out.print("Alamat Nasabah                  : ");
                        String alamat = in.nextLine();
                        sll.Enqueue(no, nama, alamat);
                        System.out.println("");
                        i++;
                    } while (i < jmlh);
                }
                break;
                case 2: {
                    sll.Dequeue();
                    System.out.println("");
                }
                break;
                case 3: {
                    sll.peek();
                    System.out.println("");
                }
                break;
                case 4: {
                    sll.peekRear();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.print("Masukkan Index Pada Data Yang Dicari : ");
                    int idx = sc.nextInt();
                    sll.peekAt(idx);
                    System.out.println("");
                }
                break;
                case 6: {
                    System.out.print("Masukkan Nomor Rekening Nasabah Yang Ingin Dicari : ");
                    String no = in.nextLine();
                    sll.peekPosition(no);
                    System.out.println("");
                }
                break;
                case 7: {
                    sll.print();
                    System.out.println("");
                }
                break;
                case 8: {
                    sll.clear(jmlh);
                    System.out.println("");
                }
                break;
            }
        } while (menu > 0 && menu < 9);
        System.out.println("TERIMA KASIH :D");
    }
}