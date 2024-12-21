package Voetbal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    public void test_VoetbalclubNaamTest_Null() {
        Voetbalclub clubNull = new Voetbalclub(null);
        assertEquals("FC", clubNull.getNaam(), "Als de naam null is, moet de standaardnaam 'FC' worden gebruikt");
    }
    @Test
    public void test_VoetbalclubNaamTest_Empty() {
        Voetbalclub clubLeeg = new Voetbalclub("");
        assertEquals("FC", clubLeeg.getNaam(), "Als de naam leeg is, moet de standaardnaam 'FC' worden gebruikt");
    }
    @Test
    public void test_VoetbalclubNaamTest_Random_Spaces() {
        Voetbalclub clubSpaties = new Voetbalclub("   ");
        assertEquals("FC", clubSpaties.getNaam(), "Als de naam alleen spaties bevat, moet de standaardnaam 'FC' worden gebruikt");
    }
    @Test
    public void test_VoetbalclubNaamTest_ValidName_Without_Spaces() {
        Voetbalclub clubGeldig = new Voetbalclub("Ajax");
        assertEquals("Ajax", clubGeldig.getNaam(), "Bij een geldige naam moet de ingevoerde naam worden gebruikt");
    }
    @Test
    public void test_VoetbalclubNaamTest_ValidName_With_Spaces() {
        Voetbalclub clubGeldigMetSpaties = new Voetbalclub("   Feijenoord   ");
        assertEquals("Feijenoord", clubGeldigMetSpaties.getNaam(), "Bij een geldige naam met spaties moeten deze worden verwijderd");
    }

    @Test
    public void test_ToString_CorrecteOutput() {
        Voetbalclub club = new Voetbalclub("Feijenoord");
        club.verwerkResultaat('w'); // 1 winst
        club.verwerkResultaat('g'); // 1 gelijkspel
        club.verwerkResultaat('v'); // 1 verlies

        String expected = "Feijenoord 3 1 1 1 4";
        String actual = club.toString();
        assertEquals(expected, actual);
    }
}
