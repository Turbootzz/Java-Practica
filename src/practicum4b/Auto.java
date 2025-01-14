package practicum4b;

public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
        this.type = tp;
        this.prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() { return prijsPerDag;}

    public String toString() {
        return String.format("%s met prijs per dag: %.1f", type, prijsPerDag);
    }

}
