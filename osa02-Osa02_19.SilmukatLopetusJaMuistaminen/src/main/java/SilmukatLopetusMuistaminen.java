
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        int count = 0;
        int summa = 0;
        double keskiarvo = 0;
        int parillinen = 0;
        int pariton = 0;
        System.out.println("Syötä luvut:");
  
        //Osa 1
//        while (true){
//        int luku = Integer.valueOf(lukija.nextLine());
//             
//         if (luku == -1){
//            System.out.println("Kiitos ja näkemiin!");    
//        }  
//        } 
           
         
       //Osa 2
//        while (true){
//        int luku = Integer.valueOf(lukija.nextLine());
//        if (luku != -1){
//        summa = summa + luku;
//        }
//        else if (luku == -1){
//            System.out.println("Kiitos ja näkemiin!"); 
//            System.out.println("Summa:" + summa);
//        }  
//        } 
  

         
       //Osa 3
//        while (true){
//        int luku = Integer.valueOf(lukija.nextLine());
//        if (luku != -1){
//        summa = summa + luku;
//        ++count;
//        }
//        else if (luku == -1){
//            System.out.println("Kiitos ja näkemiin!"); 
//            System.out.println("Summa:" + summa + "\n" + " Lukuja: " + count);
//        }  
//        } 
  
    //Osa 4
//     while (true){
//        int luku = Integer.valueOf(lukija.nextLine());
//        if (luku != -1){
//        summa = summa + luku;
//        ++count;
//        keskiarvo = (double) summa/count;
//        }
//        else if (luku == -1){
//            System.out.println("Kiitos ja näkemiin!"); 
//            System.out.println("Summa:" + summa + "\n" + "Lukuja: " + count + "\n" + "Keskiarvo:" + keskiarvo);
//        }    
//        } 


        //Osa 5
        while (true){
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku != -1){
           if ( luku % 2 != 0)
           ++pariton; 
           if (luku % 2 == 0)
           ++parillinen;    
        summa = summa + luku;
        ++count;   
        keskiarvo = (double) summa/count;
        }
     
        else if (luku == -1){
            System.out.println("Kiitos ja näkemiin!"); 
            System.out.println("Summa:" + summa + "\n" + "Lukuja: " + count 
                    + "\n" + "Keskiarvo:" + keskiarvo + "\n" + "Parillisia:"
                    + parillinen + "\n" + "Parittomia " + pariton );
            break;
        }
           
        }   
    }
}
