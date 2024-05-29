package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import in.ashokit.entity.Book;
import in.ashokit.entity.User;
import in.ashokit.service.UserBookService;

import java.util.List;

@RestController
@RequestMapping("/api/user-books")
public class UserBookController {
    @Autowired
    private UserBookService userBookService;

    @PostMapping("/borrow")
    public void borrowBook(@RequestParam Long userId, @RequestParam Long bookId) {
        userBookService.borrowBook(userId, bookId);
    }

    @PostMapping("/return")
    public void returnBook(@RequestParam Long userId, @RequestParam Long bookId) {
        userBookService.returnBook(userId, bookId);
    }

    @GetMapping("/borrowed/{userId}")
    public List<Book> getBorrowedBooks(@PathVariable Long userId) {
        return userBookService.getBorrowedBooks(userId);
    }

    @GetMapping("/borrowers/{bookId}")
    public List<User> getBookBorrowers(@PathVariable Long bookId) {
        return userBookService.getBookBorrowers(bookId);
    }
}
