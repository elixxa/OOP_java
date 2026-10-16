package andr.praktika21.pr7;

import java.util.Scanner;

public class TestPriceable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название товара: ");
        String productName = scanner.nextLine();

        System.out.print("Введите цену товара: ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введите название билета: ");
        String ticketName = scanner.nextLine();

        System.out.print("Введите цену билета: ");
        double ticketPrice = scanner.nextDouble();

        Product product = new Product(productName, productPrice);
        Ticket ticket = new Ticket(ticketName, ticketPrice);

        System.out.println();
        System.out.println("Товар: " + product.getName()
                + ", цена: " + product.getPrice());

        System.out.println("Билет: " + ticket.getName()
                + ", цена: " + ticket.getPrice());
    }
}
