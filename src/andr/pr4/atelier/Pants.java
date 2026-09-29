package andr.pr4.atelier;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: "
                + "размер " + size
                + ", европейский размер " + size.getEuroSize()
                + ", " + size.getDescription()
                + ", цена " + cost
                + ", цвет " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: "
                + "размер " + size
                + ", европейский размер " + size.getEuroSize()
                + ", " + size.getDescription()
                + ", цена " + cost
                + ", цвет " + color);
    }
}