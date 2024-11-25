package com.example.Library.Management.System;

import Model.Book;
import Model.Member;
import controller.BookController;
import controller.MemberController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
		BookController bookController = new BookController();
		MemberController memberController = new MemberController();

		Book book1 = new Book("123456", "Java Programming", "Lucky Man", 1995);
		Book book2 = new Book("789101", "Effective Java", "The Power Of Book", 2008);
		bookController.removeBook("3456");
		bookController.addBook(book2);

		Member member = new Member("M001", "Alice", "9342813587");
		memberController.registerMember(member);
		memberController.getMember("M001");

		memberController.borrowBook(member, book1);
		memberController.returnBook(member, book1);
	}
	

}
