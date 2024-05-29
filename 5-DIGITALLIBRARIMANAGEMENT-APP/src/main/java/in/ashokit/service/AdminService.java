package in.ashokit.service;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;
import in.ashokit.repo.MemberRepository;

@Service
public class AdminService {
 @Autowired
 private BookRepository bookRepository;
 
 @Autowired
 private MemberRepository memberRepository;
 
 // CRUD operations for books
 public Book addBook(Book book) {
     return bookRepository.save(book);
 }
 
 public Book updateBook(Long id, Book bookDetails) {
     Book book = bookRepository.findById(id).orElse(null);
     if (book != null) {
         // Update book details
         book.setTitle(bookDetails.getTitle());
         book.setAuthor(bookDetails.getAuthor());
         book.setCategory(bookDetails.getCategory());
         // Update other attributes as needed
         
         return bookRepository.save(book);
     }
     return null;
 }
 
 public boolean deleteBook(Long id) {
     Book book = bookRepository.findById(id).orElse(null);
     if (book != null) {
         bookRepository.delete(book);
         return true;
     }
     return false;
 }
 
 // CRUD operations for members
 public Member addMember(Member member) {
     return memberRepository.save(member);
 }
 
 public Member updateMember(Long id, Member memberDetails) {
     Member member = memberRepository.findById(id).orElse(null);
     if (member != null) {
         // Update member details
         member.setName(memberDetails.getName());
         member.setEmail(memberDetails.getEmail());
         // Update other attributes as needed
         
         return memberRepository.save(member);
     }
     return null;
 }
 
 public boolean deleteMember(Long id) {
     Member member = memberRepository.findById(id).orElse(null);
     if (member != null) {
         memberRepository.delete(member);
         return true;
     }
     return false;
 }
 
 // Other methods for fine generation, report generation, etc.
}
