
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("syötä luku");
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku < 0){
            System.out.println(luku/-1);
        }
        else {
            System.out.println(luku);
        }

    }
}
