package practicum8;

public class Fiets extends Voertuig {

    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.framenummer = fnr;
    }

    public double huidigeWaarde() {
        return super.nieuwprijs;
    }

    public boolean equals(Goed g) {
        return false;
    }
}
