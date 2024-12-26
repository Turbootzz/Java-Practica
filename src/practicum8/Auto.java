package practicum8;

public class Auto extends Voertuig {

    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    public double huidigeWaarde() {
        int huidigJaar = java.time.Year.now().getValue();
        int jarenVerschil = huidigJaar - bouwjaar;
        return nieuwprijs * Math.pow(0.7, jarenVerschil);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Auto auto = (Auto) obj;
        return kenteken.equals(auto.kenteken);
    }
}
