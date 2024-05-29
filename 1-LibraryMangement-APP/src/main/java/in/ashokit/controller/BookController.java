package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Book;
import in.ashokit.entity.Counsellore;
import in.ashokit.service.BookService;



@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        List<Book> books = bookService.findAllBooks();
        model.addAttribute("books", books);
        return "books";
    }
    
    @GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("book", new Book());
		return "registerView";
	}

	// register - button - handle

	@PostMapping("/register")
	public String handleRegister(Book book, Model model) {

		boolean status = BookService.saveBook(book);

		if(status) {
			model.addAttribute("smsg", "Book Saved");
		}else {
			model.addAttribute("emsg", " Failed To Save");
		}

		return "registerView";
	}
}
}

