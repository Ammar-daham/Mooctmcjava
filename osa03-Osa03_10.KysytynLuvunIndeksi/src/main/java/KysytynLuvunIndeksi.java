
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        int i = 0;
        System.out.print("Mitä etsitään? ");
        int luku = Integer.valueOf(lukija.nextLine());
        while (true) {
            if (luku == lista.get(i)) {
              
            }
            else
                break;
            ++i;
        }
        for( int j=0 ; j <lista.size() ; j++){
            if(luku == lista.get(j)){
                System.out.println("Luku " + luku + " on indeksissä " + j);
            }
        }

    }
}
