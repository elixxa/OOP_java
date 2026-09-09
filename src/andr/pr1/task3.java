package andr.pr1;

public class task3 {
    public static void main(String[] args) {

        int [] numbers = {5, 10, 3, 7, 14};
        int sum = 0;
        for (int i = 0; i< numbers.length; i++){
            sum = sum + numbers[i];
        }
        double average = (double) sum / numbers.length;

        System.out.println("сумма элементов массива = " +sum);
        System.out.println("среднее арифметическое = " +average);
    }

}
