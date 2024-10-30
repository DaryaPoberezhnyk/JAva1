public class Hw_City {
    private final String name;
    private final int population;

    public Hw_City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public Hw_City(String name) {
        this(name, 0);
    }

    public void displayInfo() {
        System.out.println("Город: " + name + ", Население: " + population);
    }

    public static void main(String[] args) {
        Hw_City city1 = new Hw_City("Винница", 370000);
        city1.displayInfo();

        Hw_City city2 = new Hw_City("Киев");
        city2.displayInfo();

        city1.displayInfo();
        city2.displayInfo();
    }
}
