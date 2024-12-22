package practicum8;

public class Main {

    public static void main(String[] args) {
        new BedrijfsInventaris("Shell", 139995.00);

        new Computer("Dell", "00-B0-D0-63-C2-26", 999.99, 2019);
        new Computer("HP", "0E:8F:50:BA:41:4C", 799.99, 2020);
        new Computer("Acer", "06:9E:66:D8:FC:62", 599.99, 2022);

        new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        new Auto("Tesla Model 3", 40990.00, 2017, "8-GTV-54");
        new Fiets("Stadsfiets", 359.00, 2016, 33);
        new Fiets("Mountainbike", 799.00, 2021, 658);

    }
}
