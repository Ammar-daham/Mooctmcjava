
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // osa 1
//      System.out.println("Mihin asti?");
//      int asti = Integer.valueOf(lukija.nextLine());
//      int luku = 1;
//      while (asti >= luku){
//          System.out.println(luku);
//          ++luku;
//       }
        
        System.out.println("Mihin asti?");
        int asti = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int lähtien = Integer.valueOf(lukija.nextLine());
        
        while (lähtien <= asti){
             System.out.println(lähtien);
             ++lähtien;
        }
    }
}
