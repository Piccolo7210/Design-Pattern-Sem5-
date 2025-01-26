package Lab07;

public class Book implements LibraryItem{
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public void getDetails() {
        System.out.println("Book: " + this.title + " by " + this.author);
    }

    @Override
    public void borrowItem(User user) {
        System.out.println(user.getName() + " borrowed the book: " + title);
    }
}
