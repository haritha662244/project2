package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

//BookService.java
@Service
public class BookService {
 @Autowired
 private BookRepository bookRepository;
 
 public List<Book> getAllBooks() {
     return bookRepository.findAll();
 }
 
 public List<Book> getBooksByCategory(String category) {
     return bookRepository.findByCategory(category);
 }
 
 public Book getBookById(Long id) {
     return bookRepository.findById(id).orElse(null);
 }
 
 public Book addBook(Book book) {
     // Business logic for adding a book, e.g., validation, setting default values, etc.
     return bookRepository.save(book);
 }
 
 public Book updateBook(Long id, Book bookDetails) {
     Book book = bookRepository.findById(id).orElse(null);
     if (book != null) {
         // Update book details with bookDetails
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
 
 // Other methods for CRUD operations, fine generation, etc.
}
