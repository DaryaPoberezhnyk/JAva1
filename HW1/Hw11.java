package HW1;

public class Hw11 {
    public static void drawLine(int length, boolean vertical, char symbol) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
            if (vertical) System.out.println();
        }
    }

    public static void main(String[] args) {
        drawLine(5, true, '*'); // Вертикальна
        drawLine(10, false, '-'); // Горизонтальна
    }
}
