package andr.praktika21.pr10;

import java.util.Scanner;

public class Computer implements Inputable {

    private String model;
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    @Override
    public void input(Scanner scanner) {

        System.out.print("Введите модель компьютера: ");
        model = scanner.next();

        System.out.print("Введите марку (ASUS, HP, LENOVO, APPLE): ");
        brand = Brand.valueOf(scanner.next().toUpperCase());

        System.out.print("Введите модель процессора: ");
        String processorModel = scanner.next();

        System.out.print("Введите частоту процессора: ");
        double frequency = scanner.nextDouble();

        processor = new Processor(processorModel, frequency);

        System.out.print("Введите объём памяти: ");
        int capacity = scanner.nextInt();

        memory = new Memory(capacity);

        System.out.print("Введите диагональ монитора: ");
        double diagonal = scanner.nextDouble();

        monitor = new Monitor(diagonal);
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", brand=" + brand +
                ", processor=" + processor +
                ", memory=" + memory +
                ", monitor=" + monitor +
                '}';
    }

}
