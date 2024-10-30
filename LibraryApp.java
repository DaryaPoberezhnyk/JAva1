import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Newspaper.java - класс для газеты
import java.util.Date;
import java.util.List;

// Almanac.java - класс для альманаха
import java.util.List;

// LibraryCatalog.java - класс для каталога библиотеки
import java.util.ArrayList;
import java.util.List;

// LibraryApp.java - основной класс для запуска приложения
import java.util.Arrays;
import java.util.Date;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        Book book1 = new Book("Название Книги", "Автор Книги", "Жанр Книги", 300);
        Newspaper newspaper1 = new Newspaper("Название Газеты", new Date(), Arrays.asList("Заголовок 1", "Заголовок 2"));
        Almanac almanac1 = new Almanac("Название Альманаха", Arrays.asList(book1));

        catalog.addItem(book1);
        catalog.addItem(newspaper1);
        catalog.addItem(almanac1);

        System.out.println("Полный каталог библиотеки:");
        catalog.displayCatalog();

        System.out.println("Поиск по названию 'Название Книги':");
        catalog.searchByTitle("Название Книги");

        System.out.println("Поиск по автору 'Автор Книги':");
        catalog.searchByAuthor("Автор Книги");
    }
}

