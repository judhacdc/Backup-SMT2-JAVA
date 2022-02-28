package minggu_10;
/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas1_QueueMain {

    public static void menu() {
        System.out.println("Masukkan Operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek ");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek At");
        System.out.println("7. Clear");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue = ");
        int n = sc.nextInt();
        int pilih;
        Tugas1_Queue Q = new Tugas1_Queue(n);
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Data Baru = ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data Yang Dikeluarkan = " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
//                    
                    break;
                case 5:
                    System.out.print("Masukkan Data yang Dicari = ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);

                    break;
                case 6:
                    System.out.print("Masukkan Index yang ingin ditampilkan Datanya = ");
                    int posisi = sc.nextInt();
                    Q.peekAt(posisi);
                    break;
                case 7:
                    Q.clear();
                    break;
            }
        } while (pilih > 0 || pilih < 8);
    }
}
