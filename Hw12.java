import java.util.Arrays;
import java.util.Scanner;

public class Hw12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введите 1 для сортировки по возрастанию или 2 для сортировки по убыванию: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Arrays.sort(array);
            System.out.println("Отсортированный массив (по возрастанию): " + Arrays.toString(array));
        } else if (choice == 2) {
            Arrays.sort(array);
            int[] reversedArray = new int[n];
            for (int i = 0; i < n; i++) {
                reversedArray[i] = array[n - 1 - i];
            }
            System.out.println("Отсортированный массив (по убыванию): " + Arrays.toString(reversedArray));
        } else {
            System.out.println("Неверный выбор.");
        }
    }
}
