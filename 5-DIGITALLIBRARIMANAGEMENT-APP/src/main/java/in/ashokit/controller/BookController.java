package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.service.BookService;

//BookController.java
@RestController
@RequestMapping("/api/books")
public class BookController {
 @Autowired
 private BookService bookService;
 
 @GetMapping
 public List<Book> getAllBooks() {
     return bookService.getAllBooks();
 }
 
 @GetMapping("/{id}")
 public Book getBookById(@PathVariable Long id) {
     return bookService.getBookById(id);
 }
 
 @GetMapping("/category/{category}")
 public List<Book> getBooksByCategory(@PathVariable String category) {
     return bookService.getBooksByCategory(category);
 }
 
 // other CRUD endpoints
}
