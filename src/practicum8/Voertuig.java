package practicum8;

abstract class Voertuig implements Goed {

    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

    public boolean equals(Goed g) {
        return false;
    }

    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + nieuwprijs;
    }
}
