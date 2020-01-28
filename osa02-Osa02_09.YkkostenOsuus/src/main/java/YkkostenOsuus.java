
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int count = 0;
        int osuus = 0;
        
        while (true){
            int luku = Integer.valueOf(lukija.nextLine());
           
            
            if (luku == 1){
                ++osuus;
            } 
            
            else if (luku == 0){
                if (osuus == 0)
                    System.out.println("ykkösten osuutta ei voida laskea");
                    System.out.println((Double.valueOf(osuus)/count));                
                break;
            }
            ++count;
        }          
    }
}
