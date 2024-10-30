public class Hw_Car {
    private final String model;
    private final String manufacturer;
    private final int year;
    private final double engineVolume;

    public Hw_Car(String model, String manufacturer, int year, double engineVolume) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void displayInfo() {
        System.out.println("Модель: " + model + ", Производитель: " + manufacturer + ", Год: " + year +
                ", Объем двигателя: " + engineVolume + " л");
    }

    public static void main(String[] args) {
        Hw_Car car1 = new Hw_Car("Toyota Camry", "Toyota", 2020, 2.5);
        car1.displayInfo();

        Hw_Car car2 = new Hw_Car("Ford Mustang", "Ford", 2019, 5.0);
        car2.displayInfo();

        car1.displayInfo();
        car2.displayInfo();
    }
}
