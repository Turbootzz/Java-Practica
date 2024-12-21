package practicum6a;

import java.util.ArrayList;
import java.util.List;

public class Persoon {

    private String naam;
    private double budget;
    private List<Game> mijnGames = new ArrayList<>();

    public Persoon( String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() { return budget; }

    public boolean koop(Game g) {
        if (mijnGames.contains(g)) {
            return false;
        }
        if (budget >= g.huidigeWaarde()) {
            mijnGames.add(g);
            budget -= g.huidigeWaarde();
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (!mijnGames.contains(g)) {
            return false;
        }
        if (koper.mijnGames.contains(g)) {
            return false;
        }
        if (koper.budget >= g.huidigeWaarde()) {
            mijnGames.remove(g);
            koper.mijnGames.add(g);
            koper.budget -= g.huidigeWaarde();
            budget += g.huidigeWaarde();
            return true;
        }
        return false; // Koper heeft onvoldoende budget
    }

    public Game zoekGameOpNaam(String naam) {
        for (Game game : mijnGames) {
            if (game.getNaam().equalsIgnoreCase(naam)) {
                return game;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naam).append(" heeft een budget van €").append(String.format("%.2f", budget)).append(" en bezit de volgende games:");
        for (Game game : mijnGames) {
            sb.append(game).append("\n");
        }
        return sb.toString();
    }

}
