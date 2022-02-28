// Nama     : Judha Maygustya
// Kelas    : TI - 1E
// NO Absen : 15
// NIM      : 2041720005
package minggu1;

import java.util.Scanner;

public class prak_4 {

    static int bil, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("+=========================================+");
            System.out.println("|              DERET FIBONACCI            |");
            System.out.println("+=========================================+\n");
            System.out.print("Masukkan panjang deret ==> ");
            bil = sc.nextInt();
            System.out.println("\n1. Rekursif"
                    + "\n2. Perulangan");
            System.out.print("▶ Pilih Metode : ");
            int metode = sc.nextInt();
            System.out.println();

            switch (metode) {
                case 1:
                    int j = 0;
                    for (int i = 0; i <= bil; i++) {
                        System.out.println("▶ " + fibonaccirekursif(j));
                        j++;
                    }
                    break;

                case 2:
                    fibonacciperulangan();
                    System.out.println();
                    break;
                default:
                    System.out.println("Masukkan piliha 1/2 ! ");
            }
        } while (true);

    }
// Rekursif

    static int fibonaccirekursif(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else {
            return (fibonaccirekursif(n - 1) + fibonaccirekursif(n - 2));
        }
    }

// Perulangan
    static void fibonacciperulangan() {
        long u[] = new long[bil];
        u[0] = 0;
        u[1] = 1;
        for (n = 2; n < bil; n++) {
            u[n] = u[n - 1] + u[n - 2];
        }
        for (n = 0; n < bil; n++) {
            System.out.print(u[n] + " ");
        }

    }
}
