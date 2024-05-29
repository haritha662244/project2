package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import in.ashokit.entity.Book;
import in.ashokit.entity.User;
import in.ashokit.service.BookService;
import in.ashokit.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class UserController {
	
    @Autowired
    private UserService userService;
    
   
    @GetMapping("/")
	public String login(Model model) {
		model.addAttribute("User", new User());
		return "index";
	}
    
    @PostMapping("/login")
	public String handleLogin(User user,HttpServletRequest req, Model model) {

		User userObj =
				userService.getUser(user.getEmail(), user.getPwd());
		
		if (userObj == null) {
			model.addAttribute("emsg", "Invalid Credentials");
			return "index";
		} else {
			HttpSession session=req.getSession(true);//always new session
			session.setAttribute("Bookid",userObj.getId());
			return "redirect:/allBooks";
		}
    }
		
		@RequestMapping("/searchBook")
		public String searchBook(@Param("keyword") String keyword, Model model) {

			model.addAttribute("books", BookService.searchBooks(keyword));
			model.addAttribute("keyword", keyword);
			return "list-books";
		}

		@RequestMapping("/book/{id}")
		public String findBookById(@PathVariable("id") Long id, Model model) {

			model.addAttribute("book", BookService.findBookById(id));
			return "list-book";
		}

		@GetMapping("/add")
		public String showCreateForm(Book book, Model model) {

			model.addAttribute("categories", categoryService.findAllCategories());
			model.addAttribute("authors", authorService.findAllAuthors());
			model.addAttribute("publishers", publisherService.findAllPublishers());
			return "add-book";
		}

		@RequestMapping("/add-book")
		public String createBook(Book book, BindingResult result, Model model) {
			if (result.hasErrors()) {
				return "add-book";
			}

			BookService.createBook(book);
			model.addAttribute("book", bookService.findAllBooks());
			return "redirect:/books";
		}

		@GetMapping("/update/{id}")
		public String showUpdateForm(@PathVariable("id") Long id, Model model) {

			model.addAttribute("book", bookService.findBookById(id));
			return "update-book";
		}

		@RequestMapping("/update-book/{id}")
		public String updateBook(@PathVariable("id") Book book, Model model) {
			if (user != null) {
				book.setId(id);
				return "update-book";
			}

			bookService.updateBook(book);
			model.addAttribute("book", bookService.findAllBooks());
			return "redirect:/books";
		}

		@RequestMapping("/remove-book/{id}")
		public String deleteBook(@PathVariable("id") Long id, Model model) {
			bookService.deleteBook(id);

			model.addAttribute("book", bookService.findAllBooks());
			return "redirect:/books";
		}

	}

		
		
    

//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id) {
//        return userService.getUserById(id);
//    }
//
//    @PostMapping
//    public User createUser(@RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(@PathVariable Long id, @RequestBody User user) {
//        return userService.updateUser(id, user);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//    }
//}
