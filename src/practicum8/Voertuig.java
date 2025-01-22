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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Voertuig voertuig = (Voertuig) obj;
        return this.type.equals(voertuig.type) 
            && this.bouwjaar == voertuig.bouwjaar
            && this.nieuwprijs ==voertuig.nieuwprijs;
    }

    public String toString() {
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: €" + nieuwprijs;
    }
}
