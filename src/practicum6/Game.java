package practicum6;

import java.util.ArrayList;

public class Game {

    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
        ArrayList<String> Game = new ArrayList<String>();
        Game.add(naam);
    }

    public String getNaam() { return naam; }

    public double huidigeWaarde() {
        int jarenOud = java.time.LocalDate.now().getYear() - releaseJaar;
        return nieuwprijs * Math.pow(0.7, jarenOud);
    }

    @Override
    public boolean equals(Object obj)   {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Game game = (Game) obj;
        return releaseJaar == game.releaseJaar && naam.equals(game.naam);
    }

    @Override
    public String toString() {
        return String.format("%s, uitgegeven in %d; nieuwprijs: €%.2f nu voor: €%.2f",
                naam, releaseJaar, nieuwprijs, huidigeWaarde());
    }
}
