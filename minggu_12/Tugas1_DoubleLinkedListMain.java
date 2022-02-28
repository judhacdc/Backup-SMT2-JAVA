package minggu_12;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class Tugas1_DoubleLinkedListMain {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Tugas1_DoubleLinkedList dll = new Tugas1_DoubleLinkedList();
        char pilih;
        int menu;
        do {
            System.out.println("Pilihan Menu");
            System.out.println("1. Tambah Head");
            System.out.println("2. Tambah Tail");
            System.out.println("3. Tambah Data");
            System.out.println("4. Hapus data Pertama");
            System.out.println("5. Hapus data Terakhir");
            System.out.println("6. Hapus data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari");
            System.out.println("9. Urut data");
            System.out.println("10. EXIT");
            System.out.print("Masukkan Pilihan Menu (1-8): ");
            menu = sc.nextInt();
            System.out.println("");
            if (menu < 1 || menu > 10) {
                System.out.println("Masukkan Pilihan Menu Yang Benar!");
            }

            switch (menu) {
                case 1: {
                    System.out.println("Masukkan data posisi Head:");
                    int head = sc.nextInt();
                    dll.addFirst(head);
                    break;
                }
                case 2: {
                    System.out.println("Masukkan data posisi Tail:");
                    int tail = sc.nextInt();
                    dll.addLast(tail);
                    break;
                }
                case 3: {
                    System.out.print("Masukkan Index yang dimasukkan Datanya = ");
                    int index = sc.nextInt();
                    System.out.print("Masukkan Data Yang Ingin Dimasukkan LinkedList = ");
                    int inputdata = sc.nextInt();
                    dll.add(inputdata, index);
                    break;
                }
                case 4: {
                    System.out.println("Menghapus data pertama");
                    dll.removeFirst();
                    break;
                }
                case 5: {
                    System.out.println("Menghapus data terakhir");
                    dll.removeLast();
                    break;
                }
                case 6: {
                    System.out.println("indeks yang ingin dihapus :");
                    int indexs = sc.nextInt();
                    dll.remove(indexs);
                }

                case 7: {
                    System.out.println("Data :");
                    dll.print();
                }
                case 8: {
                    System.out.println("Masukkan indeks yang dicari");
                    if (dll.isEmpty()) {
                        System.out.println("Linked List Masih Kosong");
                    } else {
                        System.out.print("Masukkan data yang akan dicari : ");
                        int data = sc.nextInt();
                        if (dll.cariData(data) == -1) {
                            System.out.println("Data Tidak Ditemukan");
                        } else {
                            System.out.println("Data " + data + " berada pada indeks : " + dll.cariData(data));
                        }
                    }
                }
                case 9: {
                    System.out.println("mengurutkan dengan bubble sort");
                    dll.BubbleSort();

                }
            }
        } while (menu > 0 && menu < 10);
    }
}