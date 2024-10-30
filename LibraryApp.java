import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Интерфейс для элементов библиотеки
interface LibraryItem {
    String getTitle();
    void displayInfo();
}

// Абстрактный класс для общих характеристик публикаций
abstract class Publication implements LibraryItem {
    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Класс для книг
class Book extends Publication {
    private String author;
    private String genre;
    private int pages;

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
        System.out.println("Книга: " + getTitle() + ", Автор: " + author + ", Жанр: " + genre + ", Страниц: " + pages);
    }
}

// Класс для газет
class Newspaper extends Publication {
    private Date issueDate;
    private List<String> headlines;

    public Newspaper(String title, Date issueDate, List<String> headlines) {
        super(title);
        this.issueDate = issueDate;
        this.headlines = headlines;
    }

    @Override
    public void displayInfo() {
        System.out.println("Газета: " + getTitle() + ", Дата выпуска: " + issueDate);
        System.out.println("Заголовки: " + String.join(", ", headlines));
    }
}

// Класс для альманахов
class Almanac extends Publication {
    private List<Book> books;

    public Almanac(String title, List<Book> books) {
        super(title);
        this.books = books;
    }

    @Override
    public void displayInfo() {
        System.out.println("Альманах: " + getTitle() + ", Список произведений:");
        for (Book book : books) {
            System.out.println(" - " + book.getTitle() + " от " + book.getAuthor());
        }
    }
}

// Класс для управления каталогом библиотеки
class LibraryCatalog {
    private List<LibraryItem> items;

    public LibraryCatalog() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println();
        }
    }

    public LibraryItem searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item instanceof Book && ((Book) item).getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add((Book) item);
            }
        }
        return foundBooks;
    }
}

// Тестирование каталога библиотеки
public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        // Инициализация тестовых данных
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков", "Роман", 400);
        Book book2 = new Book("Преступление и наказание", "Федор Достоевский", "Роман", 320);
        Book book3 = new Book("Анна Каренина", "Лев Толстой", "Роман", 500);

        List<String> newspaperHeadlines = List.of("Новости политики", "Экономика", "Спорт");
        Newspaper newspaper = new Newspaper("Комсомольская правда", new Date(), newspaperHeadlines);

        List<Book> almanacBooks = List.of(book1, book2);
        Almanac almanac = new Almanac("Литературный альманах", almanacBooks);

        catalog.addItem(book1);
        catalog.addItem(book2);
        catalog.addItem(book3);
        catalog.addItem(newspaper);
        catalog.addItem(almanac);

        // Вывод всего каталога
        System.out.println("Каталог библиотеки:");
        catalog.displayAllItems();

        // Поиск по названию
        String titleSearch = "Анна Каренина";
        LibraryItem foundItem = catalog.searchByTitle(titleSearch);
        System.out.println("Результат поиска по названию \"" + titleSearch + "\":");
        if (foundItem != null) {
            foundItem.displayInfo();
        } else {
            System.out.println("Издание с таким названием не найдено.");
        }

        // Поиск по автору
        String authorSearch = "Федор Достоевский";
        List<Book> foundBooks = catalog.searchByAuthor(authorSearch);
        System.out.println("\nРезультат поиска по автору \"" + authorSearch + "\":");
        if (!foundBooks.isEmpty()) {
            for (Book book : foundBooks) {
                book.displayInfo();
            }
        } else {
            System.out.println("Книги данного автора не найдены.");
        }
    }
}
