import java.util.Scanner;

public class Hw_Country {
    private String name;
    private String continent;
    private int population;
    private String phoneCode;
    private String capital;
    private String[] cities;

    public Hw_Country(String name, String continent, int population, String phoneCode, String capital, String[] cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название страны: ");
        name = scanner.nextLine();
        System.out.print("Введите название континента: ");
        continent = scanner.nextLine();
        System.out.print("Введите количество жителей: ");
        population = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите телефонный код: ");
        phoneCode = scanner.nextLine();
        System.out.print("Введите название столицы: ");
        capital = scanner.nextLine();
        System.out.print("Введите количество городов: ");
        int cityCount = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        cities = new String[cityCount];
        for (int i = 0; i < cityCount; i++) {
            System.out.print("Введите название города " + (i + 1) + ": ");
            cities[i] = scanner.nextLine();
        }
    }

    public void displayInfo() {
        System.out.println("Страна: " + name);
        System.out.println("Континент: " + continent);
        System.out.println("Население: " + population);
        System.out.println("Телефонный код: " + phoneCode);
        System.out.println("Столица: " + capital);
        System.out.print("Города: ");
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Hw_Country country = new Hw_Country("", "", 0, "", "", new String[]{});
        country.inputData();
        country.displayInfo();
    }
}
