package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Book;
import in.ashokit.repository.IBookRepository;
import jakarta.transaction.Transactional;

@Service
public class IBookServiceImpl implements IBookService {
	
	
	private IBookRepository bookRepository;
	
	
	@Autowired
	public void setBookRepository(IBookRepository bookRepository) {
      
		this.bookRepository=bookRepository;
		
		
		
	}


	@Override
	public int getcountofbooks(String author) {
		
				 return bookRepository.get_count_of_books(author);
	}


	@Override
	public int getBookCount(String author) {
		return bookRepository.getBookCount(author);
	}


	@Override
	@Transactional
	public int getCountByAuthor(String author) {
		return bookRepository.getCountByAuthor(author);
	}


	@Override
	public List<Book> getBookListByAuth(String author) {
		return  bookRepository.getBookListByAuth(author);
	}


}
