import java.util.Scanner;

public class Hw_Person {
    private String fullName; // ФИО
    private String birthDate; // Дата рождения
    private String phone; // Контактный телефон
    private String city; // Город
    private String country; // Страна
    private String homeAddress; // Домашний адрес

    // Конструктор
    public Hw_Person(String fullName, String birthDate, String phone, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    // Метод для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        fullName = scanner.nextLine();
        System.out.print("Введите дату рождения: ");
        birthDate = scanner.nextLine();
        System.out.print("Введите контактный телефон: ");
        phone = scanner.nextLine();
        System.out.print("Введите город: ");
        city = scanner.nextLine();
        System.out.print("Введите страну: ");
        country = scanner.nextLine();
        System.out.print("Введите домашний адрес: ");
        homeAddress = scanner.nextLine();
    }

    // Метод для вывода данных
    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Контактный телефон: " + phone);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
        System.out.println("Домашний адрес: " + homeAddress);
    }

    // Методы доступа
    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    // Метод main для тестирования класса
    public static void main(String[] args) {
        Hw_Person person = new Hw_Person("", "", "", "", "", "");
        person.inputData();
        person.displayInfo();

        // Примеры использования методов getFullName() и getBirthDate()
        System.out.println("Полученное ФИО: " + person.getFullName());
        System.out.println("Полученная дата рождения: " + person.getBirthDate());
    }
}
