
import java.util.Scanner;

public class HipHipHurraa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
       
       
        while (true){
            System.out.println("syötä luku");
            String merkkijono = lukija.nextLine();
           
            if (merkkijono.equals("lopeta")){
            System.out.println("hurraa!");
            break;
            }
        
            //else if (merkkijono.equals("lopeta")){
            else {
            System.out.println("hip!");
        
             }
        }
    }
}
