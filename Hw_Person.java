import java.util.Scanner;

public class Hw_Person {
    private String fullName;
    private String birthDate;
    private String phone;
    private String city;
    private String country;
    private String homeAddress;

    public Hw_Person(String fullName, String birthDate, String phone, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

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

    public void displayInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + birthDate);
        System.out.println("Контактный телефон: " + phone);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
        System.out.println("Домашний адрес: " + homeAddress);
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public static void main(String[] args) {
        Hw_Person person = new Hw_Person("", "", "", "", "", "");
        person.inputData();
        person.displayInfo();

        System.out.println("Полученное ФИО: " + person.getFullName());
        System.out.println("Полученная дата рождения: " + person.getBirthDate());
    }
}
