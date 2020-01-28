
import java.util.ArrayList;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
            System.out.println(lista.get(0));
            int i = lista.size() - 1;
            String sana = lista.get(i);
            System.out.println(sana);
    }
}
