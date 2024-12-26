package practicum8;

public class Main {

    public static void main(String[] args) {
        BedrijfsInventaris alleGoederen = new BedrijfsInventaris("HU", 139995.00);

        Computer dell1 = new Computer("Dell", "00-B0-D0-63-C2-26", 999.99, 2019);
        Computer dell2 = new Computer("Dell", "00-B0-D0-63-C2-26", 999.99, 2019);
        Computer hp = new Computer("HP", "0E:8F:50:BA:41:4C", 799.99, 2020);

        Fiets stadsfiets = new Fiets("Stadsfiets", 359.00, 2016, 33);
        Fiets mountainbike1 = new Fiets("Mountainbike", 799.00, 2021, 658);
        Fiets mountainbike2 = new Fiets("Mountainbike", 799.00, 2021, 658);

        Auto mercedes = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto tesla1 = new Auto("Tesla Model 3", 40990.00, 2017, "8-GTV-54");
        Auto tesla2 = new Auto("Tesla Model 3", 40990.00, 2017, "8-GTV-54");

        alleGoederen.schafAan(dell1);
        alleGoederen.schafAan(dell2);
        alleGoederen.schafAan(hp);

        alleGoederen.schafAan(stadsfiets);
        alleGoederen.schafAan(mountainbike1);
        alleGoederen.schafAan(mountainbike2);

        alleGoederen.schafAan(mercedes);
        alleGoederen.schafAan(tesla1);
        alleGoederen.schafAan(tesla2);

        System.out.println(alleGoederen);

    }
}
