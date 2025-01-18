package practicum4b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoHuurTest {

    @Test
    public void testTotaalPrijsZonderAutoEnHuurder() {
        AutoHuur ah1 = new AutoHuur();

        assertEquals(0.0, ah1.totaalPrijs()); // Totaalprijs zonder auto of huurder moet 0 zijn
    }

    @Test
    public void testTotaalPrijsMetAlleenAuto() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);

        ah1.setGehuurdeAuto(a1);

        assertEquals(0.0, ah1.totaalPrijs()); // Geen huurder, dus geen kosten
    }

    @Test
    public void testTotaalPrijsMetAlleenHuurder() {
        AutoHuur ah1 = new AutoHuur();
        Klant k1 = new Klant("Mijnheer de Vries");

        k1.setKorting(10.0);
        ah1.setHuurder(k1);

        assertEquals(0.0, ah1.totaalPrijs()); // Geen auto, dus geen kosten
    }

    @Test
    public void testTotaalPrijsMetAutoEnHuurderZonderDagen() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k1 = new Klant("Mijnheer de Vries");

        k1.setKorting(10.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);

        assertEquals(0.0, ah1.totaalPrijs()); // Geen dagen ingevuld, dus geen kosten
    }

    @Test
    public void testTotaalPrijsMetAllesIngevuld() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k1 = new Klant("Mijnheer de Vries");

        k1.setKorting(10.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);
        ah1.setAantalDagen(4);

        assertEquals(180.0, ah1.totaalPrijs()); // 4 dagen * 50 - 10% korting = 180.0
    }
}