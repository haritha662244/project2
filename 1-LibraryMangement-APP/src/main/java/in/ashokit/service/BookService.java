package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repo.BookRepository;

@Service
public interface BookService {
	
    @Autowired
    private BookRepository bookRepo;

    public List<Book> findAllBooks();

	public List<Book> searchBooks(String keyword);

	public Book findBookById(Long id);

	public void createBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Long id);
}
