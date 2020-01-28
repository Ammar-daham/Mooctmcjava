
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna tunnus:");
        String sana = lukija.nextLine();
        System.out.print("Anna salasana:");
        String sana1 = lukija.nextLine();

        boolean found = false;
        if (sana.equals("aleksi") && sana1.equals("tappara")) {
            System.out.println("Olet kirjautunut järjestelmään");
            found = true;
        }
        if (sana.equals("elina") && sana1.equals("kissa")) {
            System.out.println("Olet kirjautunut järjestelmään");
            found = true;
        } else if ( found == false){
            System.out.println("Virheellinen tai salasan!");
        }
    }
}
