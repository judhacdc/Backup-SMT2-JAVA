package minggu_10;

/**
 *
 * @author Judha Maygustya
 */
import minggu_10.p2_Penumpang;
import java.util.Scanner;

public class p2_QueueMain {

    public static void menu() {
        System.out.println("Pilih Menu");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. cek semua antrian");
        System.out.println("5. cek Antrian paling belakang");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas Queue : ");
        int jumlah = sc.nextInt();
        p2_Queue antri = new p2_Queue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Kota asal : ");
                    String asal = sc.nextLine();
                    System.out.print("Kota tujuan : ");
                    String tujuan = sc.nextLine();
                    System.out.print("Jumlah tiket : ");
                    int jml = sc.nextInt();
                    System.out.print("Harga : ");
                    int harga = sc.nextInt();
                    p2_Penumpang p = new p2_Penumpang(nama, asal, tujuan, jml, harga);
                    sc.nextLine();
                    antri.Enqueue(p);
                    break;
                case 2:
                    p2_Penumpang data = antri.Dequeue();
                    if (!"".equalsIgnoreCase(data.nama)
                            && !"".equalsIgnoreCase(data.kotaAsal) && !"".equalsIgnoreCase(data.kotaTujuan)
                            && data.jumlahTiket != 0 && data.harga != 0) {
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.kotaAsal + " " + data.kotaTujuan + " " + data.jumlahTiket + " " + data.harga + " ");
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }

}

 // judha maygsutya

