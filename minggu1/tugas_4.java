package minggu1;

import java.util.Scanner;

public class tugas_4 {

    static Scanner input = new Scanner(System.in);
    static int segitiga, tinggi, alas, panjang, lebar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\n ✦ Pilih Bangun Datar : ");
            System.out.println("   1. SEGITIGA"
                    + "\n   2.PERSEGI PANJANG"
                    + "\n   3.LINGKARAN"
                    + "\n   4.Quit\n");
            System.out.print("Masukkan Pilihan anda  [1-4] : ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    segitiga();
                    break;
                case 2:
                    persegipanjang();
                    break;
                case 3:
                    lingkaran();
                    break;

            }
            if (pilihan == 4) {
                break;
            }
        } while (true);
    }

    static void segitiga() {
        int luassegitiga;
        System.out.print("Masukkan Alas     : ");
        alas = input.nextInt();
        System.out.print("Masukkan Tinggi   : ");
        tinggi = input.nextInt();
        luassegitiga = (int) (0.5 * (alas * tinggi));
        System.out.println("Jadi Luas Segitiga Sebesar : " + luassegitiga);

    }

    static void persegipanjang() {
        int luaspersegipanjang;
        System.out.print("Masukkan Panjang  : ");
        panjang = input.nextInt();
        System.out.print("Masukkan Lebar    : ");
        lebar = input.nextInt();
        luaspersegipanjang = panjang * lebar;
        System.out.println("Jadi Luas Persegi Panjang Sebesar : " + luaspersegipanjang);

    }

    static void lingkaran() {
        double luaslingkaran;

        int r;

        System.out.print("Masukkan Jari- jari : ");
        r = input.nextInt();
        luaslingkaran = 3.14 * (r * r);
        System.out.println("Jadi Luas Lingkaran Sebesar : " + luaslingkaran);

    }

}
// CODE BY : JUDHA MAYGUSTYA
