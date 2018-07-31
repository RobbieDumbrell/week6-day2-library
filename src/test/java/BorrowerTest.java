import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library;
    Borrower borrower;

    @Before
    public void before(){
        book1 = new Book(BookGenre.COMEDY);
        book2 = new Book(BookGenre.CRIME);
        book3 = new Book(BookGenre.THRILLER);
        book4 = new Book(BookGenre.ROMANTIC);
        library = new Library(1);
        borrower = new Borrower("Ellie");
    }

    @Test
    public void canRentOutABook(){
        library.add(book2);
        borrower.rentOutBook(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
    }
}
