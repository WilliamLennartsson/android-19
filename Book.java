
public class Book {
    private String title;
    private String author;
    private static int numberOfBooks = 0;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        numberOfBooks++;
    }

    public Book(String title){
        this(title, "No author");
    }

    public String toString(){
        return author + " - " + title;
    }

    public static int getNumberOfBook(){
        return numberOfBooks;
    }

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

}
