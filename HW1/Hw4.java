package HW1;

import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шестизначне число: ");
        String number = scanner.next();

        if (number.length() != 6) {
            System.out.println("Помилка: введене число не є шестизначним.");
            return;
        }

        String result = number.charAt(5) +
                "" + number.charAt(4) +
                number.charAt(2) +
                number.charAt(3) +
                number.charAt(1) +
                number.charAt(0);

        System.out.println("Результат: " + result);
    }
}
