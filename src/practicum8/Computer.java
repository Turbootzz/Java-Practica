package practicum8;

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

    public double huidigeWaarde() { return aanschafPrijs; }

    public boolean equals(Goed g) { return false; }

    public String toString() {
        return "";
    }
}
