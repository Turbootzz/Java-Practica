package practicum4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bj) {
        adres = adr;
        bouwjaar = bj;
        String Huis = adres + " " + bouwjaar;
    }

    public void setHuisbaas(Persoon p) {
        huisbaas = p;
    }

    public Persoon getHuisbaas() { return huisbaas; }

    public String toString() {
        String s = "";
        if (huisbaas == null) {
            s = s + " Er is geen huisbaas";
        } else {
            s = s + "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas ;
        }
        return s;
    }
}