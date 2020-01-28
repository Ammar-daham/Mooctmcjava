
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int count = 0;
        int summa = 0;
        double keskiarvo = 0;
        
        while (true){
            
            System.out.println("Syötä luku");
            
            int luku = Integer.valueOf(lukija.nextLine());
            
            
            if (luku != 0){
                count = count + 1;
                summa +=luku;
                keskiarvo = (double) (summa)/count ;
                
            }
            else if (luku == 0){
               
                System.out.println("Lukujen keskiarvo " + keskiarvo );
            
                break;
            }
        }
    }
}
