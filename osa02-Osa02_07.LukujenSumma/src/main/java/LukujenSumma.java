
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int summa = 0;
        while (true){
        System.out.println("syötä luku");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku != 0){
        summa = summa + luku;
        }
        else if (luku == 0){
        System.out.println(summa);
        break;
        }
        }
    }
}
