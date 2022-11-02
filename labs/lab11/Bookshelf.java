import java.util.ArrayList;

public class Bookshelf {
    /**
     * This code is creating a Bookshelf object with a specified size
     */
    private int size;
    private ArrayList<Book> books;

    public Bookshelf() {
        size = 2;
        books = new ArrayList<Book>();
    }

    public Bookshelf(int size) {
        this.size = size;
        books = new ArrayList<Book>();
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * If the bookshelf is full, then a message is printed saying that the bookshelf is full.
     */
    public void add(Book book) {
        if (books.size() == size) {
            System.out.println("This bookshelf is full");
        }
        else {
            books.add(book);
        }
    }

    /**
     * This code is iterating through a list of books and printing the title and author of each book.
     */
    public void print() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle() + " by " + books.get(i).getAuthor());
        }
    }

    /**
     * A method which takes a single book parameter and adds it to the books ArrayList if there is room on the bookshelf.
     */
    public void addBook(Book book){
        if(books.size() < size){
            books.add(book);
        }
    }

    /**
     * A method which takes no parameters, removes the first book on the bookshelf (the book at position 0 in the books ArrayList), and returns it (If there are no books in the bookshelf, then it returns null.).
     */
    public Book removeBook(){
        if(books.size() > 0){
            return books.remove(0);
        }
        else{
            return null;
        }
    }

    /**
     * A public void method emptyBookshelf, which takes no parameters and removes all of the books from the bookshelf (empties the books ArrayList).
     */
    public void emptyBookshelf(){
        books.clear();
    }
}