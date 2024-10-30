package HW3;

import java.util.Date;




import java.util.Arrays;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = new LibraryCatalog();

        Book book1 = new Book("Название Книги", "Автор Книги", "Жанр Книги", 300);
        Newspaper newspaper1 = new Newspaper("Название Газеты", new Date(), Arrays.asList("Заголовок 1", "Заголовок 2"));
        Almanac almanac1 = new Almanac("Название Альманаха", List.of(book1));

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

