package wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = 10;
        Integer i4 = Integer.parseInt("10");

        double d1 = 10.5;

        byte b = (byte) d1;
        short s = (short) d1;
        int i = (int) d1;
        float f = (float) d1;
        long l = ((long) d1);

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Float: " + f);
        System.out.println("Long: " + l);

        Double nonZeroValue = 5.0;
        Double zeroValue = 0.0;

        double nanValue = nonZeroValue / zeroValue;
        double infinityValue = 1.0;

        System.out.println("NaN Value: " + nanValue);
        System.out.println("Infinity Value: " + infinityValue);

        if (Double.isInfinite(nanValue)) {
            System.out.println("Переменная nanValue = Infinity");
        }
        if (Double.isInfinite(infinityValue)) {
            System.out.println("Переменная infinityValue = Infinity");
        }

        long long1 = 120L;
        long long2 = 120L;
        System.out.println("120L == 120L: " + true);

        long1 = 1200L;
        long2 = 1200L;
        System.out.println("1200L == 1200L: " + true);
    }
}
