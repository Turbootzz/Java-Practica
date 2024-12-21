package practicum8;

public class Auto extends Voertuig {

    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    public double huidigeWaarde() {
        return;
    }

    public boolean equals(Object obj) {
        return false;
    }
}
