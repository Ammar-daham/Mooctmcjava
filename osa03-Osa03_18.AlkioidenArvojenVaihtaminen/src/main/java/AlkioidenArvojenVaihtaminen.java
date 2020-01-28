
import java.util.Scanner;

public class AlkioidenArvojenVaihtaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[5];
        taulukko[0] = 1;
        taulukko[1] = 3;
        taulukko[2] = 5;
        taulukko[3] = 7;
        taulukko[4] = 9;

        int indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
        System.out.println("");
        // Toteuta indeksien kysyminen ja vaihto tänne
        System.out.println("Mitkä indeksit vaihdetaan? ");
        int ensi = Integer.valueOf(lukija.nextLine());
        int toinen = Integer.valueOf(lukija.nextLine());
        int temp = 0;
        for (int i=0; i<taulukko.length; i++){
            if(ensi == i){
            temp = taulukko[ensi];
            
        }
            if (toinen == i){
                taulukko[ensi] = taulukko[toinen];
                taulukko[toinen] = temp;
        }
            else{
                taulukko[i] = taulukko[i];
            }
        }
        

        System.out.println("");
        indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
    }

}
