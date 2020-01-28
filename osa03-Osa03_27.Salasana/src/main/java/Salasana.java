
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        while (true){
        System.out.print("Anna salasana:");
        String sala = lukija.nextLine();
        if (salasana.equals(sala)) {
            System.out.println("Oikein!");
            break;
        } else {
            System.out.println("Väärin!");
        }
         
        }
       System.out.println("Salaisuus on: znvavbfgv grugl!");
    }
}
