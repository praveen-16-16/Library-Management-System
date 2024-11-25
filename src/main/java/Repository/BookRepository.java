package Repository;

import Model.Book;

import java.util.HashMap;

public class BookRepository {
    private HashMap<String, Book> bookCatalog = new  HashMap<>();

    public void addBook(Book book) {
        bookCatalog.put(book.getISBN(), book);
    }

    public Book getBookByISBN(String ISBN) {
        return bookCatalog.get(ISBN);
    }

    public void removeBook(String ISBN) {
        bookCatalog.remove(ISBN);
    }

    public  HashMap<String, Book> getBookCatalog() {
        return bookCatalog;
    }
}
