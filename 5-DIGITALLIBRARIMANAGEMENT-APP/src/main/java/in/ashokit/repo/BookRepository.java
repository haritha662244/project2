package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Book;

//BookRepository.java
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
 List<Book> findByCategory(String category);
 // other custom query methods if needed
}
