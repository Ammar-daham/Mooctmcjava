
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
         
         int i = 100 ;
         
         int luku = Integer.valueOf(lukija.nextLine());
         
         while (luku <= i){
             System.out.println(luku);
             luku++;
         }
    }
}
