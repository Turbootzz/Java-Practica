package AutoHuur;

public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() { return prijsPerDag;}

    public String toString() {
        return String.format("%s met prijs per dag: %.1f", type, prijsPerDag);
    }

}
