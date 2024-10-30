public class Hw_Person {
    private final String name;
    private final int age;

    public Hw_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Hw_Person person1 = new Hw_Person("Иван", 30);
        System.out.println("Имя: " + person1.getName());
        System.out.println("Возраст: " + person1.getAge());

    }
}
