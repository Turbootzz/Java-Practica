package Opdracht5;

public class Zaagtand {

    public static void main(String[] args) {
        String zaagtand = "s";
        boolean toggle = true;

        for(int aantal = 0; aantal < 4; aantal++) {
            if (toggle) {
                System.out.println(zaagtand);
            } else {
                System.out.println(zaagtand + zaagtand);
            }
            toggle = !toggle; // switched tussen true en false
        }
    }
}
