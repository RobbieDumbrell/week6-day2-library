import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library;
    @Before
    public void before(){
        book1 = new Book(BookGenre.COMEDY);
        book2 = new Book(BookGenre.CRIME);
        book3 = new Book(BookGenre.THRILLER);
        book4 = new Book(BookGenre.ROMANTIC);
        library = new Library(1);
    }

    @Test
    public void canCountBooksEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBookToCollection(){
        library.add(book1);
        assertEquals(1, library.bookCount());
        library.add(book2);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canCheckOutBook(){
        library.add(book1);
        assertEquals(1, library.bookCount());
        library.checkOutBook();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void bookHasGenre(){
        assertEquals(BookGenre.COMEDY, book1.getBookGenre());
    }
}
