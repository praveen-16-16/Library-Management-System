package controller;

import Model.Book;
import servises.BookService;

public class BookController {
    private BookService bookService = new BookService();

    public void addBook(Book book) {
        bookService.addBook(book);
        System.out.println("Book added successfully.");
    }


    public Book getBook(String ISBN) {
        return bookService.getBook(ISBN);
    }

    public void removeBook(String ISBN) {
        bookService.removeBook(ISBN);
        System.out.println("Book removed successfully.");
    }
}
