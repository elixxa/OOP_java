package andr.praktika2.pr6;

public class TestNameable {

    public static void main(String[] args) {

        Planet planet = new Planet("Земля");
        Car car = new Car("BMW");

        System.out.println("Планета: " + planet.getName());
        System.out.println("Машина: " + car.getName());
    }
}