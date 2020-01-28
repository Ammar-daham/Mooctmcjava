
import java.util.Scanner;

public class KahdenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        int ensi = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Syötä toinen luku!");
        int toinen = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Lukujen summa on " + (ensi+toinen));

    }
}
