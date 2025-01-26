package Lab07;

public class BookFactory extends LibraryItemFactory {
    @Override
    public LibraryItem createLibraryItem(String title, String author) {
        return new Book(title,author);
    }
}
