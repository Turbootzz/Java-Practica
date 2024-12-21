import AutoHuur.Auto;
import AutoHuur.Klant;
import AutoHuur.AutoHuur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoHuurTest {

    @Test
    public void testGeenHuurderGeenAuto() {
        AutoHuur ah1 = new AutoHuur();
        String expected = "er is geen auto bekend\n" +
                "er is geen huurder bekend\n" +
                "aantal dagen: 0 en dat kost 0.0";
        assertEquals(expected, ah1.toString());
    }

    @Test
    public void testGeenHuurderWelAuto() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        ah1.setGehuurdeAuto(a1);
        String expected = "Peugeot 207 met prijs per dag: 50.0\n" +
                "er is geen huurder bekend\n" +
                "aantal dagen: 0 en dat kost 0.0";
        assertEquals(expected, ah1.toString());
    }

    @Test
    public void testWelHuurderGeenAuto() {
        AutoHuur ah1 = new AutoHuur();
        Klant k1 = new Klant("Mijnheer de Vries");
        k1.setKorting(10.0);
        ah1.setHuurder(k1);
        String expected = "er is geen auto bekend\n" +
                "op naam van: Mijnheer de Vries (korting: 10.0%)\n" +
                "aantal dagen: 0 en dat kost 0.0";
        assertEquals(expected, ah1.toString());
    }

    @Test
    public void testWelHuurderWelAutoGeenDagen() {
        AutoHuur ah1 = new AutoHuur();
        Klant k1 = new Klant("Mijnheer de Vries");
        k1.setKorting(10.0);
        Auto a1 = new Auto("Peugeot 207", 50.0);
        ah1.setHuurder(k1);
        ah1.setGehuurdeAuto(a1);
        String expected = "Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 10.0%)\n" +
                "aantal dagen: 0 en dat kost 0.0";
        assertEquals(expected, ah1.toString());
    }

    @Test
    public void testVolledigIngevuld() {
        AutoHuur ah1 = new AutoHuur();
        Klant k1 = new Klant("Mijnheer de Vries");
        k1.setKorting(10.0);
        Auto a1 = new Auto("Peugeot 207", 50.0);
        ah1.setHuurder(k1);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        String expected = "Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 10.0%)\n" +
                "aantal dagen: 4 en dat kost 180.0";
        assertEquals(expected, ah1.toString());
    }
}