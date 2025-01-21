package practicum4b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    @Test
    public void testTotaalPrijsMetAlleenHuurderZonderDagen() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(0);

        double totaalPrijs = ah1.totaalPrijs();

        assertEquals(0.0, totaalPrijs, 0.01);
    }

    @Test
    public void testTotaalPrijsMetAutoEnHuurderVoorEenDag() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k1 = new Klant("Mijnheer de Vries");

        k1.setKorting(10.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);
        ah1.setAantalDagen(1);

        assertEquals(45.0, ah1.totaalPrijs());
    }

    @Test
    public void testTotaalPrijsMetVeelDagenGehuurd() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k1 = new Klant("Mijnheer de Vries");

        k1.setKorting(20.0);
        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);
        ah1.setAantalDagen(100);

        assertEquals(4000.0, ah1.totaalPrijs()); // 100 dagen * 50.0 - 20% korting = 4000.0
    }

    @Test
    public void testTotaalPrijsMetAutoEnHuurderZonderKorting() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k1 = new Klant("Mijnheer de Vries");

        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);
        ah1.setAantalDagen(2);

        assertEquals(100.0, ah1.totaalPrijs());
    }
    @Test
    public void testTotaalprijsZonderDagPrijsOpNul() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 0.0);
        Klant k1 = new Klant("Mijnheer de Vries");

        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);
        ah1.setAantalDagen(2);

        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    public void testTotaalPrijsZonderAutoMaarMetDagen() {
        AutoHuur ah1 = new AutoHuur();
        Klant k1 = new Klant("Mijnheer de Vries");

        ah1.setHuurder(k1);
        ah1.setAantalDagen(5);

        assertEquals(0.0, ah1.totaalPrijs());
    }
}