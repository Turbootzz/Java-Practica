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

    public boolean equals(Goed g) {
        if (this == g) return true;
        if (g == null || getClass() != g.getClass()) return false;
        Computer computer = (Computer) g;
        return macAdres.equals(computer.macAdres);
    }

    public String toString() {
        return "Computer: " + type + " met MAC-adres " + macAdres + " heeft een waarde van: €" + Utils.euroBedrag(huidigeWaarde());
    }
}
