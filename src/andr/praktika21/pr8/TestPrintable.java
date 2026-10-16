package andr.praktika21.pr8;

public class TestPrintable {

    public static void main(String[] args) {

        Printable[] printables = {
                new Book("Война и мир"),
                new Magazine("National Geographic"),
                new Book("Мастер и Маргарита"),
                new Magazine("Наука и жизнь")
        };

        for (Printable printable : printables) {
            printable.print();
        }

        Shop shop = new Shop("Книжный мир");
        shop.print();
    }
}