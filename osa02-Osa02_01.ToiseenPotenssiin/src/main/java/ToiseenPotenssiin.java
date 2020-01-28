

import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
      int summa = 0;
      System.out.println("syötä base");
      int base = Integer.valueOf(lukija.nextLine());
      summa = base * base;
      System.out.println(summa);
    }
}
