package in.ashokit.repo;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
	@Procedure
    int	get_count_of_books(String author);

}
