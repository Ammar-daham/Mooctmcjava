
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
     tulostaLukuunAsti(6);   
        
    }
    
    public static void tulostaLukuunAsti(int luku) {
         int i = 1;
    while (luku > 0 ) {
        if (i <= luku){
        System.out.println(i);
        i++;
        }
        else{
        break;
        }
        }
            
    }
}
