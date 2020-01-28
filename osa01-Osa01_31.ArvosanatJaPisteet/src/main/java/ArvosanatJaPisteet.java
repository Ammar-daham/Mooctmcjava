
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna pisteet [0-100]:");
        int pistemäärä = Integer.valueOf(lukija.nextLine());
        String arvosana = "";
        
        if (pistemäärä <0){
            arvosana = "mahdotonta";
        }
        else if (pistemäärä >=0 && pistemäärä <50 ){
            arvosana = "hylätty";
        }
        else if (pistemäärä >= 50 && pistemäärä < 60){
            arvosana ="1";
        }
         else if (pistemäärä >= 60 && pistemäärä < 70){
            arvosana ="2";
         }
         else if (pistemäärä >= 70 && pistemäärä < 80){
            arvosana ="3";
        }
         else if (pistemäärä >= 80 && pistemäärä < 90){
            arvosana ="4";
        }
         else if (pistemäärä >= 90 && pistemäärä <= 100){
            arvosana ="5";
        }
         else if (pistemäärä > 100 ){
            arvosana ="uskomatonta!";
        }
        System.out.println(arvosana);
        
    }
}
