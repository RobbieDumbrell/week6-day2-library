import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> rentedBooks;

    public Borrower(String name){
        this.name = name;
        this.rentedBooks = new ArrayList<>();
    }

    public void rentOutBook(Library library){
        this.rentedBooks.add(library.checkOutBook());
    }

    public int bookCount(){
        return this.rentedBooks.size();
    }
}
