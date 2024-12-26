package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
        alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g) {
        if (alleGoederen.contains(g)) {
            System.out.println("Het goed is al in de inventaris opgenomen.");
            return;
        }
        if (g.huidigeWaarde() > budget) {
            System.out.println("Onvoldoende budget om dit goed aan te schaffen.");
            return;
        }
        alleGoederen.add(g);
        budget -= g.huidigeWaarde();
        System.out.println(g + " is toegevoegd aan de inventaris.");
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
