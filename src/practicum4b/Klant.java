package practicum4b;

public class Klant {
    private String naam;
    private double kortingPercentage;

    public Klant(String nm) {
        this.naam = nm;
    }

    public void setKorting(double kP) {
        kortingPercentage = kP;
    }

    public double getKorting() { return kortingPercentage; }

    public String toString() {
        return String.format("%s (korting: %.1f%%)", naam, kortingPercentage);
    }
}
