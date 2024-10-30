public class Hw_Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;

    public Hw_Book(String title, String author, int year, String publisher, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Название книги: " + title + ", Автор: " + author + ", Год: " + year +
                ", Издательство: " + publisher + ", Жанр: " + genre + ", Страницы: " + pages);
    }

    public static void main(String[] args) {
        Hw_Book book1 = new Hw_Book("1984", "Джордж Оруэлл", 1949, "Secker & Warburg", "Антиутопия", 328);
        book1.displayInfo();

        Hw_Book book2 = new Hw_Book("Война и мир", "Лев Толстой", 1869, "Русский писатель", "Роман", 1225);
        book2.displayInfo();
    }
}