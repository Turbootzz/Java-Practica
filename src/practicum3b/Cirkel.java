package Cirkel;

public class Cirkel {

    int radius;
    int xPositie;
    int yPositie;

    public Cirkel(int radius, int xPositie, int yPositie) {
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
        if (radius < 1) {
            System.out.println("Radius mmoet groter dan 0 zijn!");
        }
    }

    public String toString() {
        String s = "cirkel (" + xPositie + ", " + yPositie + ") " + "met radius: " + radius;
        return s;
    }
}
