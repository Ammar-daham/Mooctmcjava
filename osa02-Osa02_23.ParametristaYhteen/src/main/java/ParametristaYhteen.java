
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

         tulostaLuvustaYhteen(5);   
        
    }
    
    public static void tulostaLuvustaYhteen(int luku) {
         int i = luku;
    while (luku >= i ) {
        if (i > 0){
        System.out.println(i);
        i--;
        }
        else{
        break;
        }
        }
             
    }

}
