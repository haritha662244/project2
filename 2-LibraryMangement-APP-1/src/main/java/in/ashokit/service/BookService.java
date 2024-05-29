package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;
import in.ashokit.repo.UserRepository;

import java.util.List;

@Service
public interface BookService {
	public List<Book> findAllBooks();

	public List<Book> searchBooks(String keyword);

	public Book findBookById(Long id);

	public void createBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Long id);


}
 

    