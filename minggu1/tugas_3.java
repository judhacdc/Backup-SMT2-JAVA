/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu1;

import java.util.Scanner;

public class tugas_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nMasukkan Jumlah Output yang di Inginkan : ");
            int bilangan = sc.nextInt();

            for (int i = 0; i <= bilangan * 2; i++) {
                int judha = 2 * i;

                if (judha % 4 == 0) {
                } else {
                    System.out.println(judha);
                }

            }
        } while (true);
    }
}
// CODE BY : JUDHA MAYGUSTYA
