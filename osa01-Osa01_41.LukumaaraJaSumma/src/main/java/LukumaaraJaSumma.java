
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int count = 0;
        int summa = 0;    
        
        while (true){
            
            System.out.println("Syötä luku");
            
            int luku = Integer.valueOf(lukija.nextLine());
            
            
            if (luku != 0){
                
                count = count + 1;
                summa = summa + luku ;
            }
            else if (luku == 0){
               
                System.out.println("Lukuja yhteensä " + count + "\n" + "Lukujen summa " + summa );
            
                break;
            }
        }
    }
}
