public class Hw_Person {
    private String name;
    private int age;

    public Hw_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hw_Person(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public static void main(String[] args) {
        Hw_Person person1 = new Hw_Person("Даша", 18);
        person1.displayInfo(); //

        Hw_Person person2 = new Hw_Person("Иван");
        person2.setAge(25);
        person2.displayInfo();
    }
}
