package practicum6;

import java.util.Objects;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() { return naam; }

    public double huidigeWaarde() {
        int jarenOud = java.time.LocalDate.now().getYear() - releaseJaar;
        return nieuwprijs * Math.pow(0.7, jarenOud);
    }

    @Override
    public boolean equals(Object obj)   {
        if (this == obj) return true;
        if (!(obj instanceof Game game)) return false;
        return releaseJaar == game.releaseJaar &&
                (Objects.equals(naam, game.naam));
    }

    @Override
    public String toString() {
        return String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f",
                naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }
}
