package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController {
 @Autowired
 private UserService userService;
 
 // Endpoint for viewing all available books
 @GetMapping("/books")
 public ResponseEntity<List<Book>> getAllBooks() {
     List<Book> books = userService.getAllBooks();
     return ResponseEntity.ok(books);
 }
 
 // Endpoint for searching books by title
 @GetMapping("/books/search")
 public ResponseEntity<List<Book>> searchBooks(@RequestParam String title) {
     List<Book> books = userService.searchBooks(title);
     return ResponseEntity.ok(books);
 }
 
 // Endpoint for issuing a book
 @PostMapping("/books/{id}/issue")
 public ResponseEntity<String> issueBook(@PathVariable Long id) {
     boolean issued = userService.issueBook(id);
     if (issued) {
         return ResponseEntity.ok("Book issued successfully");
     } else {
         return ResponseEntity.badRequest().body("Failed to issue book");
     }
 }
 
 // Endpoint for returning a book
 @PostMapping("/books/{id}/return")
 public ResponseEntity<String> returnBook(@PathVariable Long id) {
     boolean returned = userService.returnBook(id);
     if (returned) {
         return ResponseEntity.ok("Book returned successfully");
     } else {
         return ResponseEntity.badRequest().body("Failed to return book");
     }
 }
 
 // Endpoint for handling user queries
 @PostMapping("/query")
 public ResponseEntity<String> handleQuery(@RequestParam String query) {
     userService.sendEmail(query);
     return ResponseEntity.ok("Query submitted successfully");
 }
}
