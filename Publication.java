public abstract class Publication
        implements LibraryItem {
    protected final String title;

    public Publication(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public abstract void displayInfo();
}
