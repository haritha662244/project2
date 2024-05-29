package in.ashokit.controller;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.service.AdminService;

//AdminController.java
@RestController
@RequestMapping("/api/admin")
public class AdminController {
 @Autowired
 private AdminService adminService;
 
 // Endpoint for adding a new book
 @PostMapping("/books")
 public ResponseEntity<Book> addBook(@RequestBody Book book) {
     Book newBook = adminService.addBook(book);
     return ResponseEntity.ok(newBook);
 }
 
 // Endpoint for updating an existing book
 @PutMapping("/books/{id}")
 public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
     Book updatedBook = adminService.updateBook(id, bookDetails);
     if (updatedBook != null) {
         return ResponseEntity.ok(updatedBook);
     } else {
         return ResponseEntity.notFound().build();
     }
 }
 
 // Endpoint for deleting a book
 @DeleteMapping("/books/{id}")
 public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
     boolean deleted = adminService.deleteBook(id);
     if (deleted) {
         return ResponseEntity.noContent().build();
     } else {
         return ResponseEntity.notFound().build();
     }
 }
 
 // Endpoint for adding a new member
 @PostMapping("/members")
 public ResponseEntity<Member> addMember(@RequestBody Member member) {
     Member newMember = adminService.addMember(member);
     return ResponseEntity.ok(newMember);
 }
 
 // Endpoint for updating an existing member
 @PutMapping("/members/{id}")
 public ResponseEntity<Member> updateMember(@PathVariable Long id, @RequestBody Member memberDetails) {
     Member updatedMember = adminService.updateMember(id, memberDetails);
     if (updatedMember != null) {
         return ResponseEntity.ok(updatedMember);
     } else {
         return ResponseEntity.notFound().build();
     }
 }
 
 // Endpoint for deleting a member
 @DeleteMapping("/members/{id}")
 public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
     boolean deleted = adminService.deleteMember(id);
     if (deleted) {
         return ResponseEntity.noContent().build();
     } else {
         return ResponseEntity.notFound().build();
     }
 }
}
