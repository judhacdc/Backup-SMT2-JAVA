package minggu_15;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;
import java.util.Stack;

public class Tugas1_BukuMain {

    public static void main(String[] args) {

        Stack<Tugas1_Buku> buku = new Stack<>();
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("*********************");
            System.out.println("Data Buku Perpustakan");
            System.out.println("*********************");
            System.out.println("");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cetak Buku Teratas");
            System.out.println("4. Info semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("*********************");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            if (pilih == 1) {
                input.nextLine();
                System.out.print("Isbn\t   : ");
                String isbn = input.nextLine();
                System.out.print("Judul\t   : ");
                String judul = input.nextLine();
                System.out.print("Terbit\t   : ");
                String terbit = input.nextLine();
                System.out.print("Penerbit   : ");
                String penerbit = input.nextLine();
                Tugas1_Buku b = new Tugas1_Buku();
                buku.push(b = new Tugas1_Buku(isbn, judul, terbit, penerbit));
                System.out.println("");
            }

            if (pilih == 2) {
                buku.pop();
                System.out.println("");
            }

            if (pilih == 3) {
                System.out.print("Buku{" + "isbn=" + (buku.get(buku.size() - 1).isbn)
                        + ", " + "judul=" + (buku.get(buku.size() - 1).judul) + ", "
                        + "Terbit=" + (buku.get(buku.size() - 1).terbit) + ", "
                        + "Penerbit=" + (buku.get(buku.size() - 1).penerbit) + '}');
                System.out.println("");
            }

            if (pilih == 4) {
                buku.stream().forEach(b -> {
                    System.out.println("Buku{" + "isbn=" + b.isbn + ", " + "judul=" + b.judul
                            + ", " + "terbit=" + b.terbit + ", " + "penerbit=" + b.penerbit + '}');
                });
                System.out.println("");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
