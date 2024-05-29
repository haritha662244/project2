package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{

}
