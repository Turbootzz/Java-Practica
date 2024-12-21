package Uitgeverij;

public class SpatieVerwijderProces implements OpmaakProces {
    public SpatieVerwijderProces() {}

    @Override
    public String maakOp(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }
}
