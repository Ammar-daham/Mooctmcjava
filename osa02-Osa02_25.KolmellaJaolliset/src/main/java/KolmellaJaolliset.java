
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        kolmellaJaollisetValilta(3, 6);
    }

    public static void kolmellaJaollisetValilta(int alku, int loppu){
        
        int i = 1;
        while (alku <= loppu){
                if (alku % 3 == 0){
                System.out.println(alku);
                }
                ++alku;            
        }    
    }        
}

