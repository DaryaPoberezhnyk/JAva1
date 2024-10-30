package wrappers;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // Создание строк разными способами
        String literalStr = "Строка";
        String newStr = "Создано с помощью new";
        char[] charArray = {'С', 'т', 'р', 'о', 'к', 'а'};
        String fromCharArray = new String(charArray);
        byte[] byteArray = "Строка из байтов".getBytes();
        String fromBytes = new String(byteArray);
        String fromBuilder = "Строка из StringBuilder";

        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruitArray = fruits.split(",");
        String longestFruit = "";
        for (String fruit : fruitArray) {
            if (fruit.length() > longestFruit.length()) {
                longestFruit = fruit;
            }
            System.out.println("Сокращенное название: " + fruit.substring(0, 3).toLowerCase());
        }
        System.out.println("Самое длинное название: " + longestFruit.toLowerCase());

        String spacedString = "   Я_новая_строка      ";
        String trimmed = spacedString.trim().replace('_', ' ');
        System.out.println("Преобразованная строка: " + trimmed);

        // Проверка введенной строки
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String userInput = scanner.nextLine();
        System.out.println("Вы ввели: " + userInput);
        if (userInput.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (userInput.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (userInput.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        // StringBuilder с объединением строк
        StringBuilder sb = new StringBuilder();
        sb.append(literalStr).append("\n")
                .append(newStr).append("\n")
                .append(fromCharArray).append("\n")
                .append(fromBytes).append("\n")
                .append(fromBuilder).append("\n");

        String reversed = sb.reverse().toString();
        System.out.println("Развернутый StringBuilder:\n" + reversed);
    }
}
