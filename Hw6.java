import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість метрів: ");
        double meters = scanner.nextDouble();

        System.out.print("Оберіть одиницю для конвертації (1 - милі, 2 - дюйми, 3 - ярди): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println(meters + " метрів = " + (meters * 0.000621371) + " миль");
                break;
            case 2:
                System.out.println(meters + " метрів = " + (meters * 39.3701) + " дюймів");
                break;
            case 3:
                System.out.println(meters + " метрів = " + (meters * 1.09361) + " ярдів");
                break;
            default:
                System.out.println("Помилка: невірний вибір.");
        }
    }
}
