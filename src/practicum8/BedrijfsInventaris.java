package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g) {

        if(g instanceof Voertuig) {
            System.out.println("Goed zit al in de inventaris.");
            return;
        }
        if(g.huidigeWaarde() > budget) {
            System.out.println("Je hebt niet genoeg budget!");
            return;
        }
        else {
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (alleGoederen.isEmpty()) {
            sb.append("Goederen: Geen goederen aangeschaft.\n");
        } else {
            sb.append("Goederen:\n");
            for (Goed g : alleGoederen) {
                sb.append("- ").append(g.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
