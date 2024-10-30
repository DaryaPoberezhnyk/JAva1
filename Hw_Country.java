public class Hw_Country {
    private String name;
    private int area;

    public Hw_Country(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public Hw_Country(String name) {
        this(name, 0);
    }

    public void displayInfo() {
        System.out.println("Страна: " + name + ", Площадь: " + area + " км²");
    }

    public static void main(String[] args) {
        Hw_Country country1 = new Hw_Country("Украина", 603628);
        country1.displayInfo();

        Hw_Country country2 = new Hw_Country("Польша");
        country2.displayInfo();
    }
}
