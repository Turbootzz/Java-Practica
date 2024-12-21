package practicum1.Opdracht3;

public class Random {

    public static void main(String[] args) {
        int aantal = 0;
        while (aantal < 10) {
            double numRandom = Math.random();
            System.out.println("Random nummer: " + numRandom);
            aantal++;
        }
    }
}
