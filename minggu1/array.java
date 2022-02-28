package minggu1;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] royalGarden = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int aglonema = royalGarden[0][0] + royalGarden[0][1] + royalGarden[0][2] + royalGarden[0][3];
        int keladi = royalGarden[1][0] + royalGarden[1][1] + royalGarden[1][2] + royalGarden[1][3];
        int alocasia = royalGarden[2][0] + royalGarden[2][1] + royalGarden[2][2] + royalGarden[2][3];
        int mawar = royalGarden[3][0] + royalGarden[3][1] + royalGarden[3][2] + royalGarden[3][3];
        long ttl = ((royalGarden[0][0] - 1) * 75000) + ((royalGarden[0][1] - 2) * 50000) + (royalGarden[0][2] * 60000) + ((royalGarden[0][3] - 5) * 10000);
        System.out.println("+=============================================+");
        System.out.println("|--- Jumlah Stock Bunga Pada Semua Cabang  ---|");
        System.out.println("+=============================================+");
        System.out.println("|   Aglonema :" + aglonema + "                              |");
        System.out.println("|   Keladi   :" + keladi + "                              |");
        System.out.println("|   Alocasia :" + alocasia + "                              |");
        System.out.println("|   Mawar    :" + mawar + "                              |");
        System.out.println("+=============================================+");
        System.out.println("| T O T A L = " + ttl+"                         |");
        System.out.println("+=============================================+");
        System.out.println("| Total Pendapatan RoyalGarden 1 : " + ttl+"    |");
        System.out.println("+=============================================+");

    }
}
