

import java.util.Scanner;

public class EtsitynAlkionIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[10];
        taulukko[0] = 6;
        taulukko[1] = 2;
        taulukko[2] = 8;
        taulukko[3] = 1;
        taulukko[4] = 3;
        taulukko[5] = 0;
        taulukko[6] = 9;
        taulukko[7] = 7;

        

        System.out.println("Mitä etsitään? ");
       
        int luku = Integer.valueOf(lukija.nextLine());
        boolean not_found = false ;
        for(int i=0; i<taulukko.length; i++){
            if(luku == taulukko[i]){
                System.out.println("Luku " + luku + " löytyy indeksistä " + i + ".");
                not_found= true;
            }
        }
            if(not_found == false) {
                System.out.println("Lukua " + luku + " ei löydy.");
            }
        
    }

}
