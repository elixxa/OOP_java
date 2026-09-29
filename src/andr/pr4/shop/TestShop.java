package andr.pr4.shop;

import java.util.Scanner;

public class TestShop {

    public static void main(String[] args) {

        Shop shop = new Shop();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (shop.login(login, password)) {

            System.out.println("Вход выполнен");

            shop.showCategories();

            System.out.println();

            shop.showProducts(Category.ELECTRONICS);

            System.out.println();

            shop.addToCart(1);
            shop.addToCart(3);

            System.out.println();

            shop.showCart();

            System.out.println();

            shop.buy();

        } else {
            System.out.println("Неверный логин или пароль");
        }
    }
}