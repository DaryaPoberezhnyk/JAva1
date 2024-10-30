package HW1;

import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця (1-12): ");
        int month = scanner.nextInt();

        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Помилка: неправильний номер місяця.");
        }
    }
}
