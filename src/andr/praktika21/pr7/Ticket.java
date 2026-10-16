package andr.praktika21.pr7;

public class Ticket implements Priceable {

    private String name;
    private double price;

    public Ticket(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}