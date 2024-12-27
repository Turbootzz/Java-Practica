package practicum3b;

public class Cirkel {

    int radius;
    int xPositie;
    int yPositie;

    public Cirkel(int rad, int x, int y) {
        this.radius = rad;
        this.xPositie = x;
        this.yPositie = y;
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }
    @Override
    public String toString() {
        String s = "cirkel (" + xPositie + ", " + yPositie + ") " + "met radius: " + radius;
        return s;
    }
}
