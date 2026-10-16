package andr.praktika21.pr10;

import java.util.Scanner;

public class TestShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько компьютеров добавить: ");
        int amount = scanner.nextInt();

        Shop shop = new Shop(amount);

        for (int i = 0; i < amount; i++) {

            System.out.println();
            System.out.println("Компьютер №" + (i + 1));

            Computer computer = new Computer();

            computer.input(scanner);

            shop.addComputer(computer);
        }

        System.out.println();
        System.out.println("Компьютеры в магазине:");
        shop.printComputers();

        System.out.println();
        System.out.print("Введите модель компьютера для поиска: ");
        String model = scanner.next();

        Computer found = shop.findComputer(model);

        if (found != null) {
            System.out.println("Найден компьютер:");
            System.out.println(found);
        } else {
            System.out.println("Компьютер не найден");
        }

        System.out.println();
        System.out.print("Введите модель компьютера для удаления: ");
        String deleteModel = scanner.next();

        shop.removeComputer(deleteModel);

        System.out.println();
        System.out.println("После удаления:");
        shop.printComputers();
    }
}