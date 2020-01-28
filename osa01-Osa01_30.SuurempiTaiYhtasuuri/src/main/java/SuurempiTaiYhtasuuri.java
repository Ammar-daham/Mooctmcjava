
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna ensimmäinen luku:");
        
        int ensi = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Anna toinen luku:");
        
        int toinen = Integer.valueOf(lukija.nextLine());
   
        if (ensi > toinen){
            
            System.out.println("Suurempi luku:" + ensi);
            
        }
        if (toinen > ensi){
            
            System.out.println("Suurempi luku:" + toinen);
        }
        else {
            
            System.out.println("Luvut ovat yhtä suuret!");
        }
        }
        
}
