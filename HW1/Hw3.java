package HW1;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть першу цифру: ");
        int digit1 = scanner.nextInt();

        System.out.print("Введіть другу цифру: ");
        int digit2 = scanner.nextInt();

        System.out.print("Введіть третю цифру: ");
        int digit3 = scanner.nextInt();

        int result = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("Результат: " + result);
    }
}
