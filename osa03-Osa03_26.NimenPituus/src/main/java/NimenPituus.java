
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi:");
        String sana = lukija.nextLine();
        
        System.out.print("kirjainmäärä:" + laskeKirjaimet(sana));
    }
    
    // tee tänne metodi 
    // public static int laskeKirjaimet(String merkkijono)
    public static int laskeKirjaimet(String merkkijono){
        
        int count = 0;
        count = merkkijono.length();
        return count;
        
        
        
    }
}
