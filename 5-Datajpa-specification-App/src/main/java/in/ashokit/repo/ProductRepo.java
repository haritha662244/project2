package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	//Specification means query is dynamically
	//this is a findAll method
	public List<Product> findAll(Specification<Product> spec);
}
