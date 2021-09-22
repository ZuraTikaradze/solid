package tikaradze.l.problem.bird;

public class Ostrich extends Bird {

    @Override
    public void fly(int altitude) {
        // Do nothing
        throw new RuntimeException("Ostrich cant fly");
    }
}
