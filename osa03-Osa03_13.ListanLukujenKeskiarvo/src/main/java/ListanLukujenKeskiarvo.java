
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true){
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1){
                break;
            }
            lista.add(luettu);
        }
        System.out.println("");
        double keskiarvo = 0;
        int summa = 0;
        int i = 0;
       
        while(i < lista.size()){
            int luku = lista.get(i);
            summa = summa + luku;
            i++;
            
            keskiarvo = (double) summa/i;
        }
        
        System.out.println("Keskiarvo: " + keskiarvo);
    }
}
