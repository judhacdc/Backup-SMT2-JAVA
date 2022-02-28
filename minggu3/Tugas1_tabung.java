package minggu3;

/**
 *
 * @author Judha Maygustya
 */
public class Tugas1_tabung {
  
    public double jarijari,tinggi,phi=3.14;
    ;
    
    
    public Tugas1_tabung(int r,int t){
        jarijari = r;
        tinggi = t;
        
    }
    
    public double HitungVolume(){
        return phi *jarijari*tinggi;
        
    }
    public double luaspermukaan(){
        return 2*phi*jarijari*tinggi;
    }
   
}

