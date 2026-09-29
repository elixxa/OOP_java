package andr.pr4.computer;

public class TestComputer {

    public static void main(String[] args) {

        Processor processor =
                new Processor("Intel Core i5", 3.5);

        Memory memory =
                new Memory(16);

        Monitor monitor =
                new Monitor(24);

        Computer computer =
                new Computer(
                        Brand.ASUS,
                        processor,
                        memory,
                        monitor
                );

        System.out.println(computer);
    }
}