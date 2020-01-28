
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        double count = 0;
        int summa = 0;
        
        while (true){
            int luku = Integer.valueOf(lukija.nextLine());       
            
            if (luku > 0){
            count++; 
            summa = summa+luku;                 
            } 
            
            else if (luku == 0){
                if (summa == 0 || count == 0){
                   System.out.println("keskiarvon laskeminen ei ole mahdollista");
                }
                
                else{
                    double keskiarvo = Double.valueOf(summa)/ count;
                    System.out.println(keskiarvo);
                }
                break;}
            
                else if (luku < 0) {
                continue;
                }
        }
    }
    }
      

    

