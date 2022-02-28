package minggu5;

/**
 *
 * @author Judha Maygustya
 */
public class Faktorial {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;

        do {
            fakto = fakto * i;
            i++;
        } while (i <= n);

//------------------------------------------------------------------------------
//        while (i<=n){                    PERULANGAN WHILE
//         fakto = fakto * i;
//         i++;
//        }  
//------------------------------------------------------------------------------    
//        for (int i = 1; i <= n; i++) {      PERULANGAN FOR
//            fakto = fakto * i;
//        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }

    }
}
