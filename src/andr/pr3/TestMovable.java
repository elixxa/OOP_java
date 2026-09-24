package andr.pr3;

public class TestMovable {

    public static void main(String[] args) {

        MovablePoint point =
                new MovablePoint(0, 0, 2, 3);

        System.out.println(point);

        point.moveRight();
        point.moveUp();

        System.out.println(point);


        MovableCircle circle =
                new MovableCircle(0, 0, 2, 2, 5);

        System.out.println();
        System.out.println(circle);

        circle.moveRight();
        circle.moveUp();

        System.out.println(circle);


        MovableRectangle rectangle =
                new MovableRectangle(
                        0, 10,
                        10, 0,
                        2, 2
                );

        System.out.println();
        System.out.println(rectangle);

        rectangle.moveRight();

        System.out.println(rectangle);

        System.out.println(
                "Одинаковая скорость: "
                        + rectangle.isSameSpeed()
        );
    }
}