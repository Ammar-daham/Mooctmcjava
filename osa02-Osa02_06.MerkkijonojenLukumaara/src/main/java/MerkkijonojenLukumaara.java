
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int count = 0;
        System.out.println("syötä luku");
        
        
        while (true){
            String syöte = lukija.nextLine();
            if (syöte.equals("ei")){
                count = count + 1;
               
            }
            else if (syöte.equals("loppu")){
                System.out.println(count);
                break;
                
            }
        }
    }
}
