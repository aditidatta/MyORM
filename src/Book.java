/**
 * Created by alien on 4/7/17.
 */
public class Book {
    private static int AUTO_ID = 0;
    private int id;
    private String title;
    private String author;

    public Book() {
        this.id = AUTO_ID++;
        this.title = "NA";
        this.author = "NA";
    }

    public Book(String title, String author) {
        this.id = AUTO_ID++;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
