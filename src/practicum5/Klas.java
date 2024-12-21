package practicum5;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen = new ArrayList<>();

    public Klas(String kC) {
    this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double newCijfer) {
        for (Leerling l : leerlingen) {
            if (l.getNaam().equals(nm)) {
                l.setCijfer(newCijfer);
                return;
            }
        }
    }

    public ArrayList<Leerling> getLeerling() { return leerlingen; }

    public int aantalLeerlingen() { return leerlingen.size(); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("In klas ").append(klasCode).append(" zitten de volgende leerlingen:\n");
        for (Leerling l : leerlingen) {
            sb.append(l.toString()).append("\n");
        }
        return sb.toString();
    }
}