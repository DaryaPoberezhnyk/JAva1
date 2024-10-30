import java.util.Scanner;

public class Hw_City {
    private String name;
    private String region;
    private String country;
    private int population;
    private String postalCode;
    private String phoneCode;


    public Hw_City(String name, String region, String country, int population, String postalCode, String phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название города: ");
        name = scanner.nextLine();
        System.out.print("Введите название региона: ");
        region = scanner.nextLine();
        System.out.print("Введите название страны: ");
        country = scanner.nextLine();
        System.out.print("Введите количество жителей: ");
        population = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера
        System.out.print("Введите почтовый индекс: ");
        postalCode = scanner.nextLine();
        System.out.print("Введите телефонный код: ");
        phoneCode = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Город: " + name);
        System.out.println("Регион: " + region);
        System.out.println("Страна: " + country);
        System.out.println("Население: " + population);
        System.out.println("Почтовый индекс: " + postalCode);
        System.out.println("Телефонный код: " + phoneCode);
    }

    public static void main(String[] args) {
        Hw_City city = new Hw_City("", "", "", 0, "", "");
        city.inputData();
        city.displayInfo();
    }
}
