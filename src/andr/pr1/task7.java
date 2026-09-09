package andr.pr1;
import java.util.Scanner;

public class task7 {

    public static long factorial(int number) {

        long result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое неотрицательное число: ");
        int number = scanner.nextInt();

        if (number >= 0) {

            long result = factorial(number);

            System.out.println(
                    "Факториал числа " + number + " = " + result
            );

        } else {

            System.out.println(
                    "Факториал отрицательного числа не вычисляется."
            );
        }
    }
}