/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu1;

import java.util.Scanner;
public class tugas_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ani = 4 * 4500;
        int budi = 15 * 4500;
        int budisetelahdiskon = budi * 5 / 100;
        int totalbudi = budi - budisetelahdiskon;
        int bina = 6 * 4500;
        int cita = 11 * 4500;
        int citadiskon = cita * 5 / 100;
        int totalcita = cita - citadiskon;

        int total = totalcita + ani + totalbudi + bina;

        System.out.println("+-------+----------------+------------------------+");
        System.out.println("| Nama  |  Berat pakaian |  Diskon |     Total    |");
        System.out.println("+-------+----------------+------------------------+");
        System.out.println("| Ani   |      4 Kg      |    0%   |  Rp. "+ani+"   |");
        System.out.println("| Budi  |     15 Kg      |    5%   |  Rp. "+totalbudi+"   |");
        System.out.println("| Bina  |      6 Kg      |    0%   |  Rp. "+bina+"   |");
        System.out.println("| Cita  |     11 Kg      |    5%   |  Rp. "+totalcita+"   |");
        System.out.println("+-------+----------------+---------+--------------+");
        System.out.println("|     TOTAL : Rp."+total+",-                         |");
        System.out.println("+-------------------------------------------------+");

    }
}
// CODE BY : JUDHA MAYGUSTYA
