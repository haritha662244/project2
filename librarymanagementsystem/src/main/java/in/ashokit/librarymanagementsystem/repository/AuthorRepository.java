package in.ashokit.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.librarymanagementsystem.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
