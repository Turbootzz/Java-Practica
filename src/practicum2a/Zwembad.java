package practicum2a;

public class Zwembad {

    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double le, double di){
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public Zwembad() {
        breedte = 0.0;
        lengte = 0.0;
        diepte = 0.0;
    }

    // setters
    public void setBreedte(double br){ breedte = br; }
    public void setLengte(double le){ lengte = le; }
    public void setDiepte(double di){ diepte = di; }

    // getters
    public double getBreedte(){ return breedte; }
    public double getLengte(){ return lengte; }
    public double getDiepte(){ return diepte; }

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public String toString() {
        String s = "breedte: " + breedte + " lengte: " + lengte + " diepte: " + diepte;
        return s;
    }
}
