
import java.util.ArrayList;
import java.util.Scanner;

public class Summa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        luvut.add(3);
        luvut.add(2);
        luvut.add(6);
        luvut.add(-1);
        System.out.println(summa(luvut));
        
        luvut.add(5);
        luvut.add(1);
        System.out.println(summa(luvut));
        
    }
    public static int summa(ArrayList<Integer> luvut){
        int summa = 0;
        for (int i=0; i<luvut.size(); i++){
        summa = summa + luvut.get(i);
        
        }
        return summa;
    }

}
