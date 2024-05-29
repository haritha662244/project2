package in.ashokit.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
