package practicum8;

import practicum9a.Utils;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public double huidigeWaarde() {
        int huidigJaar = java.time.Year.now().getValue();
        int jarenVerschil = huidigJaar - productieJaar;
        return aanschafPrijs * Math.pow(0.6, jarenVerschil);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Computer)) return false;
        if (!super.equals(obj)) return false;
        Computer computer = (Computer) obj;
        return macAdres.equals(computer.macAdres);
    }

    public String toString() {
        return "Computer: " + type + " met MAC-adres " + macAdres + " heeft een waarde van: €" + Utils.euroBedrag(huidigeWaarde());
    }
}
