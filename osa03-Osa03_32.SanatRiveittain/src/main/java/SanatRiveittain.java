
import java.util.ArrayList;
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        

        while (true) {
            String sana = lukija.nextLine();
            if (sana.equals("")) {
                break;
            }
            String[] palat = sana.split("");
            for (String word: palat) {
                System.out.println(word);
            }
            
        }

    }
}
