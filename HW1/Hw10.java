package HW1;

import java.util.ArrayList;
import java.util.Random;

public class Hw10 {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, -10, 10).toArray();

        ArrayList<Integer> even = new ArrayList<>(), odd = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>(), negative = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
            if (num > 0) positive.add(num);
            else if (num < 0) negative.add(num);
        }

        System.out.println("Четні: " + even);
        System.out.println("Непарні: " + odd);
        System.out.println("Позитивні: " + positive);
        System.out.println("Негативні: " + negative);
    }
}
