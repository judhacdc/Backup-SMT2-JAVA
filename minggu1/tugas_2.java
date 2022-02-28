package minggu1;

public class tugas_2 {

    public static void main(String[] args) {

        int bulan = 0;
        int tabunganawal = 1000000;
        int tab;

        for (int i = 1; i < 1000; i++) {

            if (tabunganawal <= 1500000) {
                tab = tabunganawal * 2 / 100;
                tabunganawal = tabunganawal + tab;
                bulan = i;
                System.out.println("\t\t\t ~RINCIAN~ ");
                System.out.println("+==========================================================+");
                System.out.println("| Bulan        | Bunga | Saldo Per-Bulan | Bunga Per-Bulan |");
                System.out.println("+--------------+-------+-----------------+-----------------+");
                System.out.println("| Bulan ke-" + i + "  |  2 %  | Rp."+tabunganawal+",-    | Rp."+tab+",-      |");
                System.out.println("+==========================================================+");
                System.out.println("\n");

            }

        }
        System.out.println("Pada Bulan Ke- " + bulan);

    }

}
// CODE BY : JUDHA MAYGUSTYA