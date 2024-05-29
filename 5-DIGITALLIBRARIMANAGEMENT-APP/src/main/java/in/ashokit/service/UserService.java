package in.ashokit.service;

//UserService.java
@Service
public class UserService {
 @Autowired
 private BookRepository bookRepository;
 
 // View available books
 public List<Book> getAllBooks() {
     return bookRepository.findAll();
 }
 
 // Search for a book by title
 public List<Book> searchBooks(String title) {
     return bookRepository.findByTitleContainingIgnoreCase(title);
 }
 
 // Issue a book
 public boolean issueBook(Long bookId) {
     Book book = bookRepository.findById(bookId).orElse(null);
     if (book != null && book.isAvailable()) {
         book.setAvailable(false);
         bookRepository.save(book);
         return true;
     }
     return false;
 }
 
 // Return a book
 public boolean returnBook(Long bookId) {
     Book book = bookRepository.findById(bookId).orElse(null);
     if (book != null && !book.isAvailable()) {
         book.setAvailable(true);
         bookRepository.save(book);
         return true;
     }
     return false;
 }
 
 // Email option for queries
 public void sendEmail(String query) {
     // Code to send email
 }
}
