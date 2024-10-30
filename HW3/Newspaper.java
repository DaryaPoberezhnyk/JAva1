package HW3;

import java.util.Date;
import java.util.List;

public class Newspaper extends Publication {
    private final Date issueDate;
    private final List<String> headlines;

    public Newspaper(String title, Date issueDate, List<String> headlines) {
        super(title);
        this.issueDate = issueDate;
        this.headlines = headlines;
    }

    @Override
    public void displayInfo() {
        System.out.println("Газета: " + title);
        System.out.println("Дата выпуска: " + issueDate);
        System.out.println("Заголовки: ");
        for (String headline : headlines) {
            System.out.println("- " + headline);
        }
    }
}
