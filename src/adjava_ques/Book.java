package adjava_ques;
public class Book {
    private int id;
    private String title;
    private String author;
    private int yearPublished;

    public Book() {}

    // public Book(String title, String author, int yearPublished) {
    //     this.title = title;
    //     this.author = author;
    //     this.yearPublished = yearPublished;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + "]";
    }
}

