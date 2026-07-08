import java.util.LinkedList;
import java.util.Objects;

public class BookCirculationSystemImpl implements BookCirculationSystem {
    private LinkedList<Book> books = new LinkedList<>();

    @Override
    public Boolean isEmpty() {
        return books.isEmpty();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book popBook(Book book) {
        if (!books.contains(book)) {
            throw new BookNotFoundException("Book is not available in this system");
        }

        books.remove(book);
        return book;
    }

    @Override
    public Boolean isBookIncluded(Book book) {
        return books.contains(book);
    }

    @Override
    public int size() {
        return books.size();
    }

    @Override
    public Book getRandomBook() {
        return books.get((int)(Math.random() * size()));
    }

    @Override
    public Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (Objects.equals(book.getISBN(), ISBN)) {
                return book;
            }
        }

        throw new InvalidISBNException("Book with given ISBN is not in system");
    }
}
