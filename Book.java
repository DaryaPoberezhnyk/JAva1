// Book.java - класс для книги
public class Book extends Publication {
    private final String author;
    private final String genre;
    private final int pages;

    public Book(String title, String author, String genre, int pages) {
        super(title);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Книга: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Страниц: " + pages);
    }
}
