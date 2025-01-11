package practicum9a;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314, 1));
        System.out.println(Utils.euroBedrag(3.11314, 3));

        System.out.println("Aantal aanroepen: " + Utils.getEuroBedragenAangeroepen());
    }
}
