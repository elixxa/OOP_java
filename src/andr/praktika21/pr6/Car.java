package andr.praktika2.pr6;

public class Car implements Nameable {

    private String name;

    public Car (String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }
}
