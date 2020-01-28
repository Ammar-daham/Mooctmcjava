
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
    }

    public static void tulostaTyhjaa(int maara) {
        int tulostettu = 0;
        while (tulostettu < maara){
        System.out.print("*");
        tulostettu = tulostettu + 1;
        }// tehtävän osa 1
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
