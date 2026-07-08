import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class BookCirculationSystemImplTests {
    Book book1;
    Book book2;
    Book book3;
    BookCirculationSystem bookCirculationSystem;

    @BeforeEach
    public void setUp() {
        book1 = new Book("Software BME", "Jack", "123456", 2006);
        book2 = new Book("Fundamentals of SWE", "Professor Singh", "220", 2026);
        book3 = new Book("Robotics", "Professor Tamara", "31415", 2023);
        bookCirculationSystem = new BookCirculationSystemImpl();
    }

    @Test
    public void addBookTest() {
        bookCirculationSystem.addBook(book1);
        assertEquals(1, bookCirculationSystem.size());
        bookCirculationSystem.addBook(book2);
        assertEquals(2, bookCirculationSystem.size());
    }

    @Test
    public void addSameBookTest() {
        bookCirculationSystem.addBook(book1);
        bookCirculationSystem.addBook(book1);
        assertEquals(2, bookCirculationSystem.size());
    }

    @Test
    public void findBookByISBNValid() {
        bookCirculationSystem.addBook(book1);
        assertEquals(book1, bookCirculationSystem.findBookByISBN(book1.getISBN()));
    }

    @Test
    public void findBookByISBNError() {
        bookCirculationSystem.addBook(book1);
        bookCirculationSystem.addBook(book2);
        assertThrows(InvalidISBNException.class, () -> bookCirculationSystem.findBookByISBN(book3.getISBN()));
    }
}
