package HW1;

import java.util.Random;

public class Hw9 {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, -10, 10).toArray();

        int min = array[0], max = array[0], posCount = 0, negCount = 0, zeroCount = 0;

        for (int num : array) {
            if (num > 0) posCount++;
            else if (num < 0) negCount++;
            else zeroCount++;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        System.out.println("Min: " + min + ", Max: " + max);
        System.out.println("Позитивних: " + posCount + ", Негативних: " + negCount + ", Нулів: " + zeroCount);
    }
}
