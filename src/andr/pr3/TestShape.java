package andr.pr3;

public class TestShape {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false);

        System.out.println(s1);
        System.out.println("Площадь: " + s1.getArea());
        System.out.println("Периметр: " + s1.getPerimeter());
        System.out.println("Цвет: " + s1.getColor());
        System.out.println("Заполнена: " + s1.isFilled());

        Circle c1 = (Circle) s1;

        System.out.println();
        System.out.println(c1);
        System.out.println("Радиус: " + c1.getRadius());
        c1.setRadius(10);

        System.out.println("Радиус 2: " + c1.getRadius());

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);

        System.out.println();
        System.out.println(s3);
        System.out.println("Площадь: " + s3.getArea());
        System.out.println("Периметр: " + s3.getPerimeter());

        Rectangle r1 = (Rectangle) s3;

        System.out.println("Длина: " + r1.getLength());


        Shape s4 = new Square(6.6);

        System.out.println();
        System.out.println(s4);
        System.out.println("Площадь квадрата: " + s4.getArea());

        Rectangle r2 = (Rectangle) s4;

        System.out.println("Длина через Rectangle: " + r2.getLength());

        Square sq1 = (Square) r2;

        System.out.println("Сторона квадрата: " + sq1.getSide());
    }
}