package andr.pr1;
import java.util.Scanner;

public class task4 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество элементов должно быть больше нуля.");
            return;
        }
        int [] numbers = new int[n];
        int i = 0;

        while (i < numbers.length) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            numbers [i] = scanner.nextInt();
            i++;
        }
        int sumWhile = 0;
        i=0;

        while (i < numbers.length){
            sumWhile = sumWhile + numbers[i];
            i++;
        }
        int sumDoWhile = 0;
        i = 0;

        do {
            sumDoWhile = sumDoWhile + numbers[i];
            i++;
        } while (i < numbers.length);

        int min = numbers[0];
        int max = numbers[0];
        i = 1;

        while (i < numbers.length) {
            if (numbers [i] < min) {
                min = numbers[i];
            }
            if (numbers [i] > max) {
                max = numbers[i];
            }
            i++;
        }
        System.out.println("Сумма с помощью while: " + sumWhile);
        System.out.println("Сумма с помощью do while: " + sumDoWhile);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

}
