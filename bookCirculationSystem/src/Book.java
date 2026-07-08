import java.util.Objects;

public class Book {
    private String bookName;
    private String author;
    private String ISBN;
    private Integer yearOfIssue;

    public Book(String bookName, String author, String ISBN, Integer yearOfIssue) {
        this.bookName = bookName;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfIssue = yearOfIssue;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public String toString() {
        return "Book:" + bookName + " " + author + ", ISBN'" + ISBN + ", " + yearOfIssue.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getISBN(), book.getISBN()) &&
                Objects.equals(getYearOfIssue(), book.getYearOfIssue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthor(), getISBN(), getYearOfIssue());
    }
}
