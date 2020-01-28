
public class Pienin {

    public static int pienin(int luku1, int luku2){
        if (luku1 < luku2){
        return luku1;
    }
        else if (luku1 > luku2){
        return luku2; 
        }  
        return 0;
    }
    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
