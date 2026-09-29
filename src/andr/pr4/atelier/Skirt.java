package andr.pr4.atelier;

public class Skirt extends Clothes implements WomenClothing {

    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: "
                + "размер " + size
                + ", европейский размер " + size.getEuroSize()
                + ", " + size.getDescription()
                + ", цена " + cost
                + ", цвет " + color);
    }
}