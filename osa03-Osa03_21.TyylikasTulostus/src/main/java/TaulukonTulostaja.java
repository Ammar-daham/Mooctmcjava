
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        // Kirjoita koodia tänne
        int tulos = 0;
        for(int i=0; i<taulukko.length; i++){
            tulos = taulukko[i];
            if (tulos == taulukko[taulukko.length - 1]){
            System.out.print(tulos + "");
        }
            else {
                System.out.print(tulos + ", ");
            }
    }
}
}
