public class Hw_Fraction {
    private final int numerator;
    private final int denominator;

    public Hw_Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void displayFraction() {
        System.out.println("Дробь: " + numerator + "/" + denominator);
    }

    public static void main(String[] args) {
        Hw_Fraction fraction1 = new Hw_Fraction(3, 4);
        fraction1.displayFraction();

        Hw_Fraction fraction2 = new Hw_Fraction(5, 8);
        fraction2.displayFraction();

        fraction1.displayFraction();
        fraction2.displayFraction();
    }
}
