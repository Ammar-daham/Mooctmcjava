
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int count = 0;
        
        while (true){
            System.out.println();
            int luku = Integer.valueOf(lukija.nextLine());
            
            if (luku == 1){
                count = count + 1;
            }
            
            else if (luku == 0){
                System.out.println(count);
                break;
            }
            }
        
        
    }
}
