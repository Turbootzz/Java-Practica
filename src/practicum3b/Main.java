package practicum3b;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}

// Wat gebeurd er als try catch block weg wordt gehaald:
// de code compileert nog steeds
// bij het aanmaken van c2 met een radius van 0 wordt een IllegalArgumentException gegooid
// de applicatie stopt en de rest wordt niet uitgevoerd