package servises;

import Model.Book;
import Model.Member;
import Repository.MemberRepository;

public class MemberService {
    private MemberRepository memberRepository = new MemberRepository();

    public void registerMember(Member member) {
        memberRepository.addMember(member);
    }

    public Member getMember(String memberID) {
        return memberRepository.getMemberById(memberID);
    }

    public void borrowBook(Member member, Book book) {
        if (book.isAvailable()) {
            member.getBorrowedBooks().add(book);
            book.setAvailable(false);
        }
    }

    public void returnBook(Member member, Book book) {
        member.getBorrowedBooks().remove(book);
        book.setAvailable(true);
    }
}
