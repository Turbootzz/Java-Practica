package practicum3a;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam) {
        if (naam == null || naam.isBlank()) {
            this.naam = "FC"; // Standaardnaam "FC"
        } else {
            this.naam = naam.trim();
        }
        aantalGewonnen = 0;
        aantalGelijk = 0;
        aantalVerloren = 0;
    }

    public String getNaam() { return this.naam; }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + (aantalGelijk);
    }

    public void verwerkResultaat(char ch) {
        switch (ch) {
            case 'w':
                aantalGewonnen++;
                break;
            case 'g':
                aantalGelijk++;
                break;
            case 'v':
                aantalVerloren++;
                break;
            default:
                System.out.println("Ongeldige invoer: " + ch);
        }
    }
    public String toString() {
        String s = naam.trim() + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten() + " ";
        return String.format("%s %d %d %d %d %d",
                naam.trim(),
                aantalGespeeld(),
                aantalGewonnen,
                aantalGelijk,
                aantalVerloren,
                aantalPunten());
    }
}
