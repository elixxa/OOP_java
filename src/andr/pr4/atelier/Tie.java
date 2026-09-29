package andr.pr4.atelier;

public class Tie extends Clothes implements MenClothing {

    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: "
                + "размер " + size
                + ", европейский размер " + size.getEuroSize()
                + ", " + size.getDescription()
                + ", цена " + cost
                + ", цвет " + color);
    }
}