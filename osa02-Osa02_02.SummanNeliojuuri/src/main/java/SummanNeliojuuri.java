
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double summa = 0;
        System.out.println("syötä luku");
        double luku1 = Double.valueOf(lukija.nextLine());
        double luku2 = Double.valueOf(lukija.nextLine());
        summa = luku1 + luku2;
        double neliöjuuri = Math.sqrt(summa);
        System.out.println(neliöjuuri);
    }
}
