package practicum9a;
import java.text.NumberFormat;
import java.util.Locale;
public class Utils {

    private static int euroBedragenAangeroepen = 0;
    private static final int DEFAULT_PRECISIE = 2;
    
    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, DEFAULT_PRECISIE);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        euroBedragenAangeroepen++;
        String formaat = "%." + precisie + "f";
        return "€ " + String.format(formaat, bedrag);
    }

    public static int getEuroBedragenAangeroepen() { return euroBedragenAangeroepen; }
}
