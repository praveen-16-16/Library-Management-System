package servises;

import Model.Book;
import Repository.BookRepository;

public class BookService {
    private BookRepository bookRepository = new BookRepository();

    public void addBook(Book book) {
        bookRepository.addBook(book);
    }

    public Book getBook(String ISBN) {
        return bookRepository.getBookByISBN(ISBN);
    }

    public void removeBook(String ISBN) {
        bookRepository.removeBook(ISBN);
    }
}
