package semester2.jobsheet15;
public class Book14 {
    public String title;
    public String isbn;
    public Book14(String isbn , String title) {
        this.title = title;
        this.isbn = isbn;
    }
    public String toString() {
        return "ISBN : " + isbn+ " Title: " + title;
    }
}
