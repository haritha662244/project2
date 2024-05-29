package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Product;

@Service
public interface ProductService {
	
	public boolean saveProduct(Product p);
	
	
	public List<Product> getAllProducts();
	
   String deleteByIdProduct( Integer productId);
   
   Optional<Product> getProduct(Integer productId);
}
