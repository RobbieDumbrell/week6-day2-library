import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity){
        this.bookCollection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.bookCollection.size();
    }

    public boolean checkIfStockFull(){
        if(this.bookCount() < this.capacity) {
            return false;
        } else {
            return true;
        }
    }

    public void add(Book book){
        if(this.checkIfStockFull() == false) {
            this.bookCollection.add(book);
        }
    }

    public Book checkOutBook(){
        return this.bookCollection.remove(0);
    }
}
