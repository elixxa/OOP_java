package andr.praktika21.pr10;

public class Monitor {

    private double diagonal;

    public Monitor(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return diagonal + " дюймов";
    }
}