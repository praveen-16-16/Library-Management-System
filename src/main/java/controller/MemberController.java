package controller;

import Model.Book;
import Model.Member;
import servises.MemberService;

public class MemberController {
    private MemberService memberService = new MemberService();

    public void registerMember(Member member) {
        memberService.registerMember(member);
        System.out.println("Member registered successfully.");
    }

    public void getMember(String memberID) {
        memberService.getMember(String.valueOf(memberID));
        System.out.println("Member get successfully");
    }

    public void borrowBook(Member member, Book book) {
        memberService.borrowBook(member, book);
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook(Member member, Book book) {
        memberService.returnBook(member, book);
        System.out.println("Book returned successfully.");
    }
}
