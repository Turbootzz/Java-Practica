package Uitgeverij;

import java.util.ArrayList;

public class StringProcessor {

    private ArrayList<OpmaakProces> processen;

    public StringProcessor() {
        this.processen = new ArrayList<>();
    }

    public String verwerk(String input) {
        String resultaat = input;
        for (OpmaakProces proces : processen) {
            resultaat = proces.maakOp(resultaat);
        }

        return resultaat;
    }

    public void voegProcesToe(OpmaakProces proces) {
        processen.add(proces);
    }
}
