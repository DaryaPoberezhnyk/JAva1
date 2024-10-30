import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private final List<LibraryItem> items;

    public LibraryCatalog() {
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayCatalog() {
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println();
        }
    }

    public void searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.displayInfo();
                return;
            }
        }
        System.out.println("Элемент с названием " + title + " не найден.");
    }

    public void searchByAuthor(String author) {
        for (LibraryItem item : items) {
            if (item instanceof Book && ((Book) item).getAuthor().equalsIgnoreCase(author)) {
                item.displayInfo();
                return;
            }
        }
        System.out.println("Книга с автором " + author + " не найдена.");
    }
}
