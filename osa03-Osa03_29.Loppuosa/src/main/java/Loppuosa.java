import java.util.Scanner;

public class Loppuosa {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Anna sana:");
        String sana = lukija.nextLine();
        
        System.out.print("Alkuosan pituus:");
        int alkuosan = Integer.valueOf(lukija.nextLine());
        int len = sana.length();
        
        
        System.out.print("Tulos:" + sana.substring(len - alkuosan));
    }
}
