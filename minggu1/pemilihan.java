package minggu1;

import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            // deklarasi variable 
            int nilai_tugas, nilai_uts, nilai_uas; // variable nilai
            int persentase_tugas, persentase_uts, persentase_uas; // variable untuk persentase
            int jumlah;
            String nilai_huruf, keputusan;
            System.out.println("+===========================================+");
            System.out.println("|       Program Menghitung Nilai akhir      |");
            System.out.println("+===========================================+");
            System.out.println("| Nilai Di ambil dengan Ketentuan Berikut : |");
            System.out.println("+----------------------+--------------------+");
            System.out.println("|     Nilang Angka     |     Nilai Huruf    |");
            System.out.println("+----------------------+--------------------+");
            System.out.println("|     80 <N≤ 100       |          A         |");
            System.out.println("|      73 <N≤ 80       |          B+        |");
            System.out.println("|      65 <N≤ 73       |          B         |");
            System.out.println("|      60 <N≤ 65       |          C+        |");
            System.out.println("|      50 <N≤ 60       |          C         |");
            System.out.println("|      39 <N≤ 50       |          D         |");
            System.out.println("|       N <N≤ 39       |          E         |");
            System.out.println("+----------------------+--------------------+\n");

            System.out.println("▶ Isi Data Nilai di Bawah ini : ");
            System.out.print(" Masukkan Nilai Tugas : ");
            nilai_tugas = sc.nextInt();
            System.out.print(" Masukkan Nilai UTS   : ");
            nilai_uts = sc.nextInt();
            System.out.print(" Masukkan Nilai UAS   : ");
            nilai_uas = sc.nextInt();

            // rumus 
            persentase_tugas = nilai_tugas * 20 / 100;
            persentase_uts = nilai_uts * 35 / 100;
            persentase_uas = nilai_uas * 45 / 100;
            jumlah = persentase_tugas + persentase_uts + persentase_uas;
            // pemilihan

            if (jumlah > 80 && jumlah <= 100) {
                nilai_huruf = "A";
                keputusan = "LULUS";
                 System.out.println("+===========================================+");
                System.out.println("|             - - H A S I L - -             |");
                System.out.println("+===========================================+");
                System.out.println("| Nilai Huruf  : "+nilai_huruf+"                          |");
                System.out.println("| Jumlah Nilai : "+jumlah+"                         |");
                System.out.println("| Keputusan    : "+keputusan+"                      |");
                System.out.println("+===========================================+\n");

            } else if (jumlah > 73 && jumlah <= 80) {
                nilai_huruf = "B+";
                keputusan = "LULUS";
                 System.out.println("+===========================================+");
                System.out.println("|             - - H A S I L - -             |");
                System.out.println("+===========================================+");
                System.out.println("| Nilai Huruf  : "+nilai_huruf+"                          |");
                System.out.println("| Jumlah Nilai : "+jumlah+"                          |");
                System.out.println("| Keputusan    : "+keputusan+"                |");
                System.out.println("+===========================================+\n");

            } else if (jumlah > 65 && jumlah <= 73) {
                nilai_huruf = "B";
                keputusan = "LULUS";
                    System.out.println("+===========================================+");
                System.out.println("|             - - H A S I L - -             |");
                System.out.println("+===========================================+");
                System.out.println("| Nilai Huruf  : "+nilai_huruf+"                          |");
                System.out.println("| Jumlah Nilai : "+jumlah+"                          |");
                System.out.println("| Keputusan    : "+keputusan+"                |");
                System.out.println("+===========================================+\n");
            } else if (jumlah > 60 && jumlah <= 65) {
                nilai_huruf = "C+";
                keputusan = "LULUS";
                    System.out.println("+===========================================+");
                System.out.println("|             - - H A S I L - -             |");
                System.out.println("+===========================================+");
                System.out.println("| Nilai Huruf  : "+nilai_huruf+"                          |");
                System.out.println("| Jumlah Nilai : "+jumlah+"                          |");
                System.out.println("| Keputusan    : "+keputusan+"                |");
                System.out.println("+===========================================+\n");
            } else if (jumlah > 50 && jumlah <= 60) {
                nilai_huruf = "C";
                keputusan = "LULUS";
                  System.out.println("+===========================================+");
                System.out.println("|             - - H A S I L - -             |");
                System.out.println("+===========================================+");
                System.out.println("| Nilai Huruf  : "+nilai_huruf+"                          |");
                System.out.println("| Jumlah Nilai : "+jumlah+"                          |");
                System.out.println("| Keputusan    : "+keputusan+"                |");
                System.out.println("+===========================================+\n");

            } else if (jumlah > 39 && jumlah <= 50) {
                nilai_huruf = "D";
                keputusan = "TIDAK LULUS";
                      System.out.println("+===========================================+");
                System.out.println("|             - - H A S I L - -             |");
                System.out.println("+===========================================+");
                System.out.println("| Nilai Huruf  : "+nilai_huruf+"                          |");
                System.out.println("| Jumlah Nilai : "+jumlah+"                          |");
                System.out.println("| Keputusan    : "+keputusan+"                |");
                System.out.println("+===========================================+\n");
            } else if (jumlah <= 39) {
                nilai_huruf = "E";
                keputusan = "TIDAK LULUS";
                System.out.println("+===========================================+");
                System.out.println("|             - - H A S I L - -             |");
                System.out.println("+===========================================+");
                System.out.println("| Nilai Huruf  : "+nilai_huruf+"                          |");
                System.out.println("| Jumlah Nilai : "+jumlah+"                          |");
                System.out.println("| Keputusan    : "+keputusan+"                |");
                System.out.println("+===========================================+\n");
            } else {
                System.out.println("Kategori tidak di temukan !\n\n");
            }

        } while (true);
    }

}
