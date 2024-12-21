package practicum8;

public class Computer {
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

    public double huidigeWaarde() {}

    public boolean equals(Computer comp) {} // nog niet zeker of obj goed is

    public String toString() {
        return "";
    }
}
