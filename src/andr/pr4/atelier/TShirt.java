package andr.pr4.atelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: "
                + "размер " + size
                + ", европейский размер " + size.getEuroSize()
                + ", " + size.getDescription()
                + ", цена " + cost
                + ", цвет " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: "
                + "размер " + size
                + ", европейский размер " + size.getEuroSize()
                + ", " + size.getDescription()
                + ", цена " + cost
                + ", цвет " + color);
    }
}