package Lab07;

public class MagazineFactory extends LibraryItemFactory{
    @Override
    public LibraryItem createLibraryItem(String title, String author) {
        return new Magazine(title,author);
    }
}
