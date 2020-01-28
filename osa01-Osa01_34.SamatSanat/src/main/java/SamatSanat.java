
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen merkkijono:");
        String ensi = lukija.nextLine();
        
        System.out.println("Syötä toinen merkkijono:");
        String toinen = lukija.nextLine();

        if (ensi.equals(toinen)){
        System.out.println("Samat sanat");
        }
       
        
        else {
        System.out.println("Ei sitten");
        }
       
    }
}
    