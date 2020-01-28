
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int count = 0 ;
        
        while (true){
        
        System.out.println("Syötä luku");
        
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku < 0){
            
            count = count + 1;
           
        }
        
        else if (luku == 0) {
            
            System.out.println("Negatiivisia lukuja yhteensä " + count);
            
            break;
        }
    }

}
}
