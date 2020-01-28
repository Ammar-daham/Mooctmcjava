
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku >= 18){
            
            System.out.println("Olet täysi-ikäinen!");
            
        }
        else  {   
            System.out.println("Et ole täysi-ikäinen!");
        } 
    }
}
