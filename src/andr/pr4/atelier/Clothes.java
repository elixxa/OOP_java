package andr.pr4.atelier;

public abstract class Clothes {

    protected Size size;
    protected double cost;
    protected String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
