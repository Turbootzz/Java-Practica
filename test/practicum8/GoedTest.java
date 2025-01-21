package practicum8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoedTest {

    @Test
    public void test_vermijd_hetzelfde_product() {
        BedrijfsInventaris inventaris = new BedrijfsInventaris("Testbedrijf", 10000.0);

        Computer computer1 = new Computer("Dell", "00-B0-D0-63-C2-26", 999.99, 2019);
        Computer computer2 = new Computer("Dell", "00-B0-D0-63-C2-26", 999.99, 2019); // zelfde als computer1

        inventaris.schafAan(computer1);
        inventaris.schafAan(computer2);

        assertEquals(1, inventaris.toString().split("\n").length - 1, "Er zijn dubbele objecten aangeschaft!");
    }

    @Test
    public void test_onvoldoende_budget() {
        BedrijfsInventaris inventaris = new BedrijfsInventaris("Testbedrijf", 500.0); // beperkt budget

        Auto auto = new Auto("Tesla Model 3", 40990.00, 2020, "8-GTV-54"); // te duur

        inventaris.schafAan(auto);

        assertEquals(0, inventaris.toString().split("\n").length - 1, "Er is een object aangeschaft ondanks onvoldoende budget!");
    }

    @Test
    public void test_huidigeWaarde() {

        int huidigJaar = java.time.Year.now().getValue();

        Computer computer = new Computer("Dell", "00-B0-D0-63-C2-26", 1000.0, huidigJaar - 2);
        Auto auto = new Auto("Mercedes", 30000.0, huidigJaar - 3, "4-XYZ-12");
        Fiets fiets = new Fiets("Stadsfiets", 500.0, huidigJaar - 1, 12345);

        double verwachteWaardeComputer = 1000.0 * Math.pow(0.6, 2);
        double verwachteWaardeAuto = 30000.0 * Math.pow(0.7, 3);
        double verwachteWaardeFiets = 500.0 * Math.pow(0.9, 1);

        assertEquals(verwachteWaardeComputer, computer.huidigeWaarde(), 0.01, "Huidige waarde van de computer klopt niet!");
        assertEquals(verwachteWaardeAuto, auto.huidigeWaarde(), 0.01, "Huidige waarde van de auto klopt niet!");
        assertEquals(verwachteWaardeFiets, fiets.huidigeWaarde(), 0.01, "Huidige waarde van de fiets klopt niet!");
    }
}