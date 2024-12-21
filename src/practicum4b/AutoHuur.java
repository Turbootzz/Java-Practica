package practicum4b;

public class AutoHuur {

    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {}

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() { return aantalDagen; }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() { return gehuurdeAuto; }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Klant getHuurder() { return huurder; }

    public double totaalPrijs() {
        if (gehuurdeAuto == null || huurder == null) {
            return 0.0;
        }
        double prijs = aantalDagen * gehuurdeAuto.getPrijsPerDag();
        double korting = prijs * (huurder.getKorting() / 100);
        return prijs - korting;
    }

    public String toString() {
        String autoInfo = (gehuurdeAuto == null) ? "er is geen auto bekend" : gehuurdeAuto.toString();
        String klantInfo = (huurder == null) ? "er is geen huurder bekend" : "op naam van: " + huurder.toString();
        return String.format("%s\n%s\naantal dagen: %d en dat kost %.1f", autoInfo, klantInfo, aantalDagen, totaalPrijs());
    }
}
