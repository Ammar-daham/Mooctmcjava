
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

         
         int i = 0;
         
         
         int luku = Integer.valueOf(lukija.nextLine());
         
         while (luku >= i){
             System.out.println(i);
             i++;
         }
    }
}
