package HW1;

import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double number = scanner.nextDouble();

        System.out.print("Введіть відсоток: ");
        double percentage = scanner.nextDouble();

        double result = (number * percentage) / 100;
        System.out.println(percentage + "% від " + number + " = " + result);
    }
}
