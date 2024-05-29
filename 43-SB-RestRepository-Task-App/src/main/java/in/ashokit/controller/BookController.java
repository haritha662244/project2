package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	@GetMapping("/")
	public String Book() {
		return "i like this book";
	}

}
