
import java.util.Scanner;

public class MontakoKertaaMerkkijonossa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mistä haetaan: ");
        String merkkijono = lukija.nextLine();
        System.out.print("Mitä haetaan: ");
        String haettava = lukija.nextLine();
        
        int indeksi = 0;
        int i = 0;
        while (indeksi < merkkijono.length()) {
            
            int kohta = merkkijono.indexOf(haettava, indeksi);

            if (kohta == -1) {
                break;
            }
            
            indeksi = kohta + 1;
            ++i;
        }
        
System.out.println("Merkkijonon " + haettava + " esiintymiskertoja:" + i);
            
        

    }
}
