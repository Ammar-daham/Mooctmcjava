
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true){
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999 ){
            break;
            }
            lista.add(luettu);
        }
            System.out.println("");

            int pienin = lista.get(0);
            int indeksi = 0;
          
               
            while (indeksi < lista.size()){
                
                int  luku = lista.get(indeksi);
                if (pienin > luku ){
                    pienin = luku;   
                }
                indeksi = indeksi + 1;
                
            }
          
            System.out.println("Pienin luku on " + pienin);
            
            for( int j=0 ; j <lista.size() ; j++){
                  if (pienin == lista.get(j) ){         
            System.out.println("Pienin luku löytyy indeksistä " + j);
                  } 
              
           }
    }
    
}
