package HW2;

import java.util.Scanner;

public class Hw_Fraction {
    private int numerator;
    private int denominator;

    public Hw_Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числитель: ");
        numerator = scanner.nextInt();
        System.out.print("Введите знаменатель: ");
        denominator = scanner.nextInt();
    }

    public void displayInfo() {
        System.out.println("Дробь: " + numerator + "/" + denominator);
    }

    public Hw_Fraction add(Hw_Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Hw_Fraction(newNumerator, newDenominator);
    }

    public Hw_Fraction subtract(Hw_Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Hw_Fraction(newNumerator, newDenominator);
    }

    public Hw_Fraction multiply(Hw_Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Hw_Fraction(newNumerator, newDenominator);
    }

    public Hw_Fraction divide(Hw_Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Hw_Fraction(newNumerator, newDenominator);
    }

    public static void main(String[] args) {
        Hw_Fraction fraction1 = new Hw_Fraction(0, 1);
        fraction1.inputData();
        fraction1.displayInfo();

        Hw_Fraction fraction2 = new Hw_Fraction(0, 1);
        fraction2.inputData();
        fraction2.displayInfo();

        Hw_Fraction sum = fraction1.add(fraction2);
        System.out.print("Сумма: ");
        sum.displayInfo();

        Hw_Fraction difference = fraction1.subtract(fraction2);
        System.out.print("Разность: ");
        difference.displayInfo();

        Hw_Fraction product = fraction1.multiply(fraction2);
        System.out.print("Произведение: ");
        product.displayInfo();

        Hw_Fraction quotient = fraction1.divide(fraction2);
        System.out.print("Частное: ");
        quotient.displayInfo();
    }
}
