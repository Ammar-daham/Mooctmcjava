
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka vanha olet?");
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku >= 0 && luku <= 120){
            System.out.println("Ok");
        }
        else {
            System.out.println("Mahdotonta");
        }
    }
}
