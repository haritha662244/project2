package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Product;
@Repository
public interface ProductRepo  extends CrudRepository<Product,Integer> {

}
