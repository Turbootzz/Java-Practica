package practicum8;

public class Fiets extends Voertuig {

    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.framenummer = fnr;
    }

    public double huidigeWaarde() {
        int huidigJaar = java.time.Year.now().getValue();
        int jarenVerschil = huidigJaar - bouwjaar;
        return nieuwprijs * Math.pow(0.9, jarenVerschil);
    }

    public boolean equals(Goed g) {
        if (this == g) return true;
        if (g == null || getClass() != g.getClass()) return false;
        Fiets fiets = (Fiets) g;
        return framenummer == fiets.framenummer;
    }
}
