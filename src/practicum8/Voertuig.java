package Practicum8;

abstract class Voertuig {

    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

    public boolean equals(Object obj) {
        return false;
    }

    public String toString() {
        return "";
    }
}
