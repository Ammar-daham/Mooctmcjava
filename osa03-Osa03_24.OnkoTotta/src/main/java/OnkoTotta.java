
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kirjoita merkkijono:");
        String sana = lukija.nextLine();
        boolean found = false;
        if (sana.equals("totta")){
            
            System.out.println("Oikein meni");
            found = true;
        }
        else  {
            found = false;
            System.out.println("Koitappa uudelleen");
        }
    }
}
