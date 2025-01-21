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

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fiets)) return false;
        if (!super.equals(obj)) return false;
        Fiets fiets = (Fiets) obj;
        return framenummer == fiets.framenummer;
    }
}
