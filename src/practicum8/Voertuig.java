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
        if (this == g) return true;
        if (g == null || getClass() != g.getClass()) return false;
        Voertuig voertuig = (Voertuig) g;
        return type.equals(voertuig.type) && bouwjaar == voertuig.bouwjaar;
    }

    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + nieuwprijs;
    }
}
