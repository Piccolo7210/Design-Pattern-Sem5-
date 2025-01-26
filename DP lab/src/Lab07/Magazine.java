package Lab07;

public class Magazine implements LibraryItem{
    private String title;
    private String author;
    public Magazine(String title,String author){
        this.author=author;
        this.title=title;
    }
    @Override
    public void getDetails() {
        System.out.println("Book: " + this.title + " by " + this.author);
    }

    @Override
    public void borrowItem(User user) {
        System.out.println(user.getName() + " borrowed the Magazine: " + title);
    }
}
