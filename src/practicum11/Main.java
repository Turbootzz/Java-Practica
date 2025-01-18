package practicum11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voer de naam van het bronbestand in:");
        String bronbestand = sc.nextLine();

        System.out.println("Voer de naam van het bestemmingsbestand in:");
        String bestemmingsbestand = sc.nextLine();

        System.out.println("Voer de waarde van in 1 USD in (1 USD in eurocenten, bv. 91.8720):");
        double geldconversie;
        try {
            geldconversie = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Ongeldige invoer voor de waarde. Gebruik alleen getallen.");
            return;
        }
        Path bronPad = Path.of("texts/" + bronbestand);
        Path bestemmingPad = Path.of("texts/" + bestemmingsbestand);

        if (!Files.exists(bronPad)) {
            System.out.println("Het opgegeven bronbestand bestaat niet: " + bronbestand);
            return;
        }

        try (BufferedReader br = Files.newBufferedReader(bronPad);
             BufferedWriter bw = Files.newBufferedWriter(bestemmingPad)) {

            String regel;
            while ((regel = br.readLine()) != null) {

                String[] delen = regel.split(" : ");
                if (delen.length != 2) {
                    System.out.println("Onverwacht formaat in bronbestand: " + regel);
                    continue;
                }

                String artikel = delen[0];
                double prijsUSD;
                try {
                    prijsUSD = Double.parseDouble(delen[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Ongeldige prijs in regel: " + regel);
                    continue;
                }

                double prijsEuro = (prijsUSD * geldconversie) / 100;

                bw.write(artikel + " : " + String.format("%.2f", prijsEuro));
                bw.newLine();
            }
            System.out.println("Gelukt. Het bestand is opgeslagen als: " + bestemmingsbestand);

        } catch (IOException e) {
            System.out.println("Er is een fout opgetreden bij het lezen of schrijven van bestanden: " + e.getMessage());
        }
    }
}
